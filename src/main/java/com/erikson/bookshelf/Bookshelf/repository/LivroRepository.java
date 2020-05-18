package com.erikson.bookshelf.Bookshelf.repository;

import com.erikson.bookshelf.Bookshelf.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LivroRepository extends JpaRepository<Livro, Long> {

}
