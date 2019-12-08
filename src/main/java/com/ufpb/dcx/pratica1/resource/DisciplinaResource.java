package com.ufpb.dcx.pratica1.resource;

import java.util.List;
import com.ufpb.dcx.pratica1.model.Disciplina;
import com.ufpb.dcx.pratica1.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * DisciplinaResource
 */

@RestController
@RequestMapping("/v1/api/disciplinas") 
public class DisciplinaResource {

  @Autowired
  private DisciplinaRepository disciplinaRepository;

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<?> getDisciplinas(){
    List<Disciplina> disciplinas = disciplinaRepository.findAll();
    return !disciplinas.isEmpty() ? ResponseEntity.ok(disciplinas) : ResponseEntity.noContent().build();
    
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Disciplina inserirCategoria(@RequestBody Disciplina disciplina){
    return disciplinaRepository.save(disciplina);
  }

  
}