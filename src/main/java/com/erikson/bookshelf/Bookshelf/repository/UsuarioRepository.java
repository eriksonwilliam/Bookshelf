package com.erikson.bookshelf.Bookshelf.repository;

import java.util.Optional;

import com.erikson.bookshelf.Bookshelf.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Optional<Usuario> findByEmail(String email);

}
