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
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/carrinho")
@Scope(value= WebApplicationContext.SCOPE_REQUEST)
public class CarrinhoComprasController {

    @Autowired
    private ProdutoDAO produtoDAO;

    @Autowired
    private CarrinhoCompras carrinho;

    @RequestMapping("/add")
    public ModelAndView add(Integer produtoId, TipoPreco tipo){
        ModelAndView modelAndView = new ModelAndView("redirect:/produtos");
        CarrinhoItem carrinhoItem = criaItem(produtoId, tipo);
        carrinho.add(carrinhoItem);
        return modelAndView;
    }

    private CarrinhoItem criaItem(Integer produtoId, TipoPreco tipoPreco) {

        Produto produto = produtoDAO.find(produtoId);

        CarrinhoItem carrinhoItem = new CarrinhoItem(produto, tipoPreco);
        return carrinhoItem;
    }

}
