package com.lojadegames.gamestomy.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lojadegames.gamestomy.repository.CategoriaRepository;



@Service
public class CategoriaService {

	
	private @Autowired CategoriaRepository repository;

	public CategoriaRepository getRepository() {
		return repository;
	}

	public void setRepository(CategoriaRepository repository) {
		this.repository = repository;
	}
	

}