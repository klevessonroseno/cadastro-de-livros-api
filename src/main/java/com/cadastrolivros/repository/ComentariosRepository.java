package com.cadastrolivros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastrolivros.domain.Comentario;

public interface ComentariosRepository extends JpaRepository<Comentario, Long>{

}
