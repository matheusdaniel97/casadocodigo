package com.matheus.casadocodigo.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;

@Profile("prod")
public class JPAProductionConfiguration {

    @Autowired
    private Environment environment;

    @Bean
    private Properties additionalProperties() {
        Properties prop = new Properties();
        prop.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        prop.setProperty("hibernate.show_sql", "true");
        prop.setProperty("hibernate.hbm2ddl.auto", "update");
        return prop;
    }

    @Bean
    public DataSource dataSource() throws URISyntaxException{
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");

        URI dbUrl = new URI(environment.getProperty("DATABASE_URL"));

        dataSource.setUrl("jdbc:postgresql://"+dbUrl.getHost()+":"+dbUrl.getPort()+dbUrl.getPath());
        dataSource.setUsername(dbUrl.getUserInfo().split(":")[0]);
        dataSource.setPassword(dbUrl.getUserInfo().split(":")[1]);

        return dataSource;
    }

}
