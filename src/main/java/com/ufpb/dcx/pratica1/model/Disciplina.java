package com.ufpb.dcx.pratica1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Disciplina
 */

@Entity
@Table(name="disciplinas")
public class Disciplina {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idDisciplina;
  private String nomeDisciplina;
  private float notaDisciplina;

  public long getId() {
    return idDisciplina;
  }

  public String getNome() {
    return nomeDisciplina;
  }

  public float getNota() {
    return notaDisciplina;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (idDisciplina ^ (idDisciplina >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Disciplina other = (Disciplina) obj;
    if (idDisciplina != other.idDisciplina)
      return false;
    return true;
  }
  
}