package com.ufpb.dcx.pratica1.resource;

import java.util.List;

import com.ufpb.dcx.pratica1.model.Disciplina;
import com.ufpb.dcx.pratica1.repository.DisciplinaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
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
  public List<Disciplina> getDisciplinas(){
    return disciplinaRepository.findAll();
  }
  
}