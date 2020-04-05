package com.matheus.casadocodigo.conf;

import com.matheus.casadocodigo.daos.UsuarioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebMvcSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private UsuarioDAO usuarioDAO;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/resources/**").permitAll()
                .antMatchers("/tags/**").permitAll()
                .antMatchers("/pagamento/**").permitAll()
                .antMatchers("/produtos/form").hasRole("ADMIN")
                .antMatchers("/carrinho/**").permitAll()
                .antMatchers(HttpMethod.POST,"/produtos").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET, "/produtos").hasRole("ADMIN")
                .antMatchers("/produtos/**").permitAll()
                .antMatchers("/home").permitAll()
                .antMatchers("/").permitAll()
                .anyRequest().authenticated()
                .and().formLogin().loginPage("/login").permitAll()
                .and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(usuarioDAO).passwordEncoder(new BCryptPasswordEncoder());
    }
}
