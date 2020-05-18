package com.erikson.bookshelf.Bookshelf.controller;

import com.erikson.bookshelf.Bookshelf.model.Livro;
import com.erikson.bookshelf.Bookshelf.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/livro")
public class LivroController {

    @Autowired
    LivroRepository repository;

    @RequestMapping("/")
    public Iterable<Livro> findAll() {

        Iterable<Livro> livros = repository.findAll();

        return livros;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Livro postLivro(@RequestBody Livro livro) throws Exception {
        try{
            repository.save(livro);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
        return livro;
    }
}
