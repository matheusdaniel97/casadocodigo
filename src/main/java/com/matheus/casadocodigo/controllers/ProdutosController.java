package com.matheus.casadocodigo.controllers;

import com.matheus.casadocodigo.daos.ProdutoDAO;
import com.matheus.casadocodigo.models.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProdutosController {

    @Autowired
    private ProdutoDAO produtoDAO;

    @RequestMapping("produtos/form")
    public String form(){
        return"produtos/form";
    }

    @RequestMapping("produtos")
    public String grava(Produto produto){
        System.out.println(produto);
        produtoDAO.gravar(produto);
        return "produtos/ok";
    }
}
