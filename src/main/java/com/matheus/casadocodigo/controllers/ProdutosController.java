package com.matheus.casadocodigo.controllers;

import com.matheus.casadocodigo.daos.ProdutoDAO;
import com.matheus.casadocodigo.models.Produto;
import com.matheus.casadocodigo.models.TipoPreco;
import com.matheus.casadocodigo.validation.ProdutoValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.persistence.NoResultException;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/produtos")
public class ProdutosController {

    @Autowired
    private ProdutoDAO produtoDAO;

    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.addValidators(new ProdutoValidation());
    }

    @RequestMapping("/form")
    public ModelAndView form(Produto produto){
        ModelAndView modelAndView = new ModelAndView("produtos/form");
        modelAndView.addObject("tipos", TipoPreco.values());
        return modelAndView;
    }

    @RequestMapping(method=RequestMethod.POST)
    @CacheEvict(value="produtoHome", allEntries = true)
    public ModelAndView gravar(MultipartFile file, @Valid Produto produto,
                               BindingResult result, RedirectAttributes redirectAttributes) {

        if(result.hasErrors()) {
            return form(produto);
        }

        produtoDAO.gravar(produto);

        redirectAttributes.addFlashAttribute("sucesso", "Produto cadastrado com sucesso!");

        return new ModelAndView("redirect:produtos");
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView listar() {
        List<Produto> produtos = produtoDAO.listar();
        ModelAndView modelAndView = new ModelAndView("produtos/lista");
        modelAndView.addObject("produtos", produtos);
        return modelAndView;
    }

    @RequestMapping("/detalhe/{id}")
    public ModelAndView detalhe(@PathVariable("id") Integer id) {
        ModelAndView modelAndView = new ModelAndView("produtos/detalhe");
        Produto produto = produtoDAO.find(id);
        modelAndView.addObject("produto", produto);
        return modelAndView;
    }


}
