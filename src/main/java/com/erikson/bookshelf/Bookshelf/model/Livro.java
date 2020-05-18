package com.erikson.bookshelf.Bookshelf.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "livro")
public class Livro {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String descricao;
	private String autor;
	private String anoPublicacao;



}
