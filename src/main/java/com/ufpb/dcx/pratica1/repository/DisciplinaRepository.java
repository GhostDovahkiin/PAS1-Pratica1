package com.ufpb.dcx.pratica1.repository;

import com.ufpb.dcx.pratica1.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 * DisciplinaRepository
 */

@Service
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long>, CrudRepository<Disciplina, Long>{

  
}