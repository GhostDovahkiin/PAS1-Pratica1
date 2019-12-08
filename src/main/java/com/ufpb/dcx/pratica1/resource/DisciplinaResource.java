package com.ufpb.dcx.pratica1.resource;

import java.net.URI;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletResponse;
import com.ufpb.dcx.pratica1.model.Disciplina;
import com.ufpb.dcx.pratica1.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
  public ResponseEntity<Disciplina> inserirCategoria(@RequestBody Disciplina disciplina, HttpServletResponse response){
    Disciplina disciplinaSalva = disciplinaRepository.save(disciplina);

    URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{idDisciplina}")
              .buildAndExpand(disciplinaSalva.getId()).toUri();
    response.setHeader("Location", uri.toASCIIString());

    return ResponseEntity.created(uri).body(disciplinaSalva);
  }

  @GetMapping("/{idDisciplina}")
  public Disciplina buscarDisciplinaPeloId(@PathVariable long idDisciplina){
    return disciplinaRepository.findById(idDisciplina)
        .orElseThrow(() -> new EntityNotFoundException());
  }

  @DeleteMapping("/{idDisciplina}")
  public Disciplina atualizaNotaDisciplina(@PathVariable long idDisciplina){
    Disciplina disciplinaSalva = disciplinaRepository.findById(idDisciplina)
    .orElseThrow(() -> new EntityNotFoundException());
    disciplinaRepository.delete(disciplinaSalva);
    return disciplinaSalva;
  }

  @GetMapping("/ranking")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<?> getDisciplinaRanking(){
    List<Disciplina> disciplinas = disciplinaRepository.findAll(Sort.by(Sort.Direction.DESC, "notaDisciplina"));
    return !disciplinas.isEmpty() ? ResponseEntity.ok(disciplinas) : ResponseEntity.noContent().build();

  }
}