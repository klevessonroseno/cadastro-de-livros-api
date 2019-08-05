package com.cadastrolivros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastrolivros.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long> {

} 
