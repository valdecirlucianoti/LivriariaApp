package com.livrariaapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.livrariaapp.model.Livro;

public interface LivroRepository extends CrudRepository<Livro, String>{
	
}
