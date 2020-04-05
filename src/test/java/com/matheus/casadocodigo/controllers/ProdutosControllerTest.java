package com.matheus.casadocodigo.controllers;

import com.matheus.casadocodigo.conf.AppWebConfiguration;
import com.matheus.casadocodigo.conf.DataSourceConfigurationTest;
import com.matheus.casadocodigo.conf.JPAConfiguration;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.support.NoOpCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JPAConfiguration.class, AppWebConfiguration.class, DataSourceConfigurationTest.class})
@ActiveProfiles("test")
@Ignore

//Este teste ocorre erro com cache ao utilizar o Java em versão 9+ devido a isso está sendo ignorado

public class ProdutosControllerTest {


    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setup(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void deveRetornarParaHomeComOsLivros() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/home")).
                andExpect(MockMvcResultMatchers.forwardedUrl("/WEB-INF/views/home.jsp"));
    }

}
