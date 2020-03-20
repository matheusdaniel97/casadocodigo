package com.matheus.casadocodigo.controllers;

import com.matheus.casadocodigo.daos.ProdutoDAO;
import com.matheus.casadocodigo.models.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ProdutoDAO produtoDAO;

    @RequestMapping("/home")
    @Cacheable(value = "produtoHome")
    public ModelAndView index() {
        List<Produto> produtos = produtoDAO.listar();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("produtos", produtos);
        return modelAndView;
    }

}
