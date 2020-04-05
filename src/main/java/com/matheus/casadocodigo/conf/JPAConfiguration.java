package com.matheus.casadocodigo.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;



@EnableTransactionManagement
public class JPAConfiguration {

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {

        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();

        factoryBean.setPackagesToScan("com.matheus.casadocodigo.models");
        factoryBean.setDataSource(dataSource);

        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        factoryBean.setJpaVendorAdapter(vendorAdapter);

        Properties prop = additionalProperties();
        factoryBean.setJpaProperties(prop);

        return factoryBean;


    }

    private Properties additionalProperties() {
        Properties prop = new Properties();
        prop.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
        prop.setProperty("hibernate.show_sql", "true");
        prop.setProperty("hibernate.hbm2ddl.auto", "update");
        return prop;
    }

    @Bean
    @Profile("dev")
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/casadocodigo");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory emf){
        return new JpaTransactionManager(emf);
    }

}
