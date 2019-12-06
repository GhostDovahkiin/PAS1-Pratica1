package com.ufpb.dcx.pratica1.controller;

import java.util.concurrent.atomic.AtomicLong;

import com.ufpb.dcx.pratica1.Disciplina;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Pratica1Controller
 */

@RestController
public class DisciplinaController {

  private final AtomicLong counter = new AtomicLong();
  private final String disciplina = "PAS1";


  @RequestMapping(method = RequestMethod.GET, value = "v1/api/disciplinas")
  public Disciplina getDisciplinas(){
    return new Disciplina(counter.incrementAndGet(), disciplina, counter.incrementAndGet());
  }
  

}