package com.ufpb.dcx.pratica1;

/**
 * Disciplina
 */
public class Disciplina {
  public final long id;
  String nome;
  double nota;

  public Disciplina(long id){
    this.id = id;
    nome = "PAS1";
    nota = 10;
  }

  public long getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public double getNota() {
    return nota;
  }

}