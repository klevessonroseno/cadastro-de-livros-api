package com.cadastrolivros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastrolivros.domain.Autor;

public interface AutoresRepository extends JpaRepository<Autor, Long> {

}
