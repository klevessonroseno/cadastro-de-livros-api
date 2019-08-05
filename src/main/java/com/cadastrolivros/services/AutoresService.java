package com.cadastrolivros.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastrolivros.domain.Autor;
import com.cadastrolivros.repository.AutoresRepository;
import com.cadastrolivros.services.exceptions.AutorExistenteException;
import com.cadastrolivros.services.exceptions.AutorNaoEncontradoException;

@Service
public class AutoresService {
	
	@Autowired
	private AutoresRepository autoresRepository;
	
	public List<Autor> listar(){
		return autoresRepository.findAll();
	}
	
	public Autor salvar(Autor autor) {
		if(autor.getId() != null) {
			Autor autorBuscado = autoresRepository.findOne(autor.getId());
			
			if(autorBuscado != null) {
				throw new AutorExistenteException("O autor já existe.");
			}
		}
		return autoresRepository.save(autor);
	}
	public Autor buscar(Long id) {
		
		Autor autor = autoresRepository.findOne(id);
		
		if(autor == null) {
			throw new AutorNaoEncontradoException("O autor não pôde ser encontrado");
		}
		return autor;
	}
}

