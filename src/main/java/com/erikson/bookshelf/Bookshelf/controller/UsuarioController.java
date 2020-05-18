package com.erikson.bookshelf.Bookshelf.controller;

import com.erikson.bookshelf.Bookshelf.model.Usuario;
import com.erikson.bookshelf.Bookshelf.repository.UsuarioRepository;
import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioRepository repository;

    @RequestMapping("/")
    public Iterable<Usuario> findAll() {

        Iterable<Usuario> usuarios = repository.findAll();

        return usuarios;
    }

    @RequestMapping("/{id}")
    public Usuario findById(@PathVariable("id") long id) {

        Usuario usuario = repository.getOne(id);

        return usuario;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String postUsuario(@RequestBody Usuario usuario) {
        usuario.setSenha(new BCryptPasswordEncoder().encode(usuario.getSenha()));

        repository.save(usuario);

        return usuario.getNome();
    }
}
