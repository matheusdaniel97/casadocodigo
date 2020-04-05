package com.matheus.casadocodigo.controllers;

import com.matheus.casadocodigo.daos.ProdutoDAO;
import com.matheus.casadocodigo.models.CarrinhoCompras;
import com.matheus.casadocodigo.models.CarrinhoItem;
import com.matheus.casadocodigo.models.Produto;
import com.matheus.casadocodigo.models.TipoPreco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import java.io.Serializable;

@Controller
@RequestMapping("/carrinho")
@Scope(value= WebApplicationContext.SCOPE_REQUEST)
public class CarrinhoComprasController implements Serializable {

    private static final long serialVersionUID = 1L;

    @Autowired
    private ProdutoDAO produtoDAO;

    @Autowired
    private CarrinhoCompras carrinho;

    @RequestMapping("/add")
    public ModelAndView add(Integer produtoId, TipoPreco tipoPreco){
        ModelAndView modelAndView = new ModelAndView("redirect:/carrinho");
        CarrinhoItem carrinhoItem = criaItem(produtoId, tipoPreco);
        carrinho.add(carrinhoItem);
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView itens(){
        return new ModelAndView("/carrinho/itens");
    }

    private CarrinhoItem criaItem(Integer produtoId, TipoPreco tipoPreco) {
        Produto produto = produtoDAO.find(produtoId);
        CarrinhoItem carrinhoItem = new CarrinhoItem(produto, tipoPreco);
        return carrinhoItem;
    }

    @RequestMapping("/remover")
    public ModelAndView remover(Integer produtoId, TipoPreco tipoPreco){
        carrinho.remover(produtoId, tipoPreco);
        return new ModelAndView("redirect:/carrinho");
    }

}
