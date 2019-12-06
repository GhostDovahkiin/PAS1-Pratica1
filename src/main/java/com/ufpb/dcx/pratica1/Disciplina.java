package com.ufpb.dcx.pratica1;

/**
 * Disciplina
 */
public class Disciplina {
  public final long id;
  String nome;
  double nota;

  public Disciplina(long id, String nome, double nota){
    this.id = id;
    this.nome = nome;
    this.nota = nota;
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