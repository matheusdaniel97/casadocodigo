package com.matheus.casadocodigo.controllers;

import com.matheus.casadocodigo.models.CarrinhoCompras;
import com.matheus.casadocodigo.models.DadosPagamento;
import com.matheus.casadocodigo.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.concurrent.Callable;

@Controller
@RequestMapping("/pagamento")
@Scope(value= WebApplicationContext.SCOPE_REQUEST)
public class PagamentoController {

    @Autowired
    private MailSender sender;

    @Autowired
    private CarrinhoCompras carrinhoCompras;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/finalizar", method = RequestMethod.POST)
    public Callable<ModelAndView> finalizar(RedirectAttributes model, @AuthenticationPrincipal Usuario usuario){

        return() -> {

            String uri = "http://book-payment.herokuapp.com/payment";

            try{

                String response = restTemplate.postForObject(uri, new DadosPagamento(carrinhoCompras.getTotal()), String.class);
                System.out.println(response);

                enviaEmailCompraProduto(usuario);

                model.addFlashAttribute("sucesso", response);
                return new ModelAndView("redirect:/home");

            }catch (HttpClientErrorException e){
                e.printStackTrace();
                System.out.println();
                model.addFlashAttribute("falha", "Valor maior que o permitido");
                return new ModelAndView("redirect:/home");
            }

        };
    }

    private void enviaEmailCompraProduto(Usuario usuario) {

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("Compra finalizada com sucesso");
        //simpleMailMessage.setTo(usuario.getEmail());
        simpleMailMessage.setTo("ganzenmuller1997@gmail.com");
        simpleMailMessage.setText("Compra aprovada com sucesso no valor de " + carrinhoCompras.getTotal());
        simpleMailMessage.setFrom("compras@casadocodigo.com.br");

        sender.send(simpleMailMessage);

    }

}
