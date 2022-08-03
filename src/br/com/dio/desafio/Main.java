package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
  public static void main(String[] args) {
    Curso curso1 = new Curso();
    Curso curso2 = new Curso();
    curso1.setTitulo("Curso Java");
    curso1.setDescricao("descrição curso java");
    curso1.setCargaHoraria(8);

    curso2.setTitulo("Curso Js");
    curso2.setDescricao("descrição curso js");
    curso2.setCargaHoraria(4);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria java");
    mentoria.setDescricao("descrição mentoria java");
    mentoria.setData(LocalDate.now());



    System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria);
  }
}
