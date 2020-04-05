package com.matheus.casadocodigo.daos;

import com.matheus.casadocodigo.models.Usuario;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UsuarioDAO implements UserDetailsService {

    @PersistenceContext
    private EntityManager manager;

    public Usuario loadUserByUsername(String email) {
        List<Usuario> usuarios = manager.createQuery("select u from Usuario u where u.email = :email", Usuario.class)
                .setParameter("email", email).getResultList();

        if (usuarios.isEmpty()) {
            throw new UsernameNotFoundException("Usuario " + email + " não foi encontrado");
        }

        return usuarios.get(0);
    }
}
