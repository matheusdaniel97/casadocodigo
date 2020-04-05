package com.matheus.casadocodigo.daos;


import com.matheus.casadocodigo.builders.ProdutoBuilder;
import com.matheus.casadocodigo.conf.DataSourceConfigurationTest;
import com.matheus.casadocodigo.conf.JPAConfiguration;
import com.matheus.casadocodigo.models.Produto;
import com.matheus.casadocodigo.models.TipoPreco;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JPAConfiguration.class, ProdutoDAO.class, DataSourceConfigurationTest.class})
@ActiveProfiles("test")
public class ProdutoDAOTest {

    @Autowired
    private ProdutoDAO produtoDAO;

    @Test
    @Transactional
    public void deveSomarTodosPrecosPorTipo() {

        List<Produto> produtosImpressos = ProdutoBuilder.
                newProduto(TipoPreco.IMPRESSO, BigDecimal.TEN).more(3).buildAll();


        List<Produto> produtosEbook = ProdutoBuilder.
                newProduto(TipoPreco.EBOOK, BigDecimal.TEN).more(3).buildAll();

        produtosImpressos.stream().forEach(produtoDAO::gravar);
        produtosEbook.stream().forEach(produtoDAO::gravar);

        BigDecimal valor = produtoDAO.somaPrecoPorTipo(TipoPreco.EBOOK);
        Assert.assertEquals(new BigDecimal(40).setScale(2),valor);

    }
}
