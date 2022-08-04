package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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

    //Polimorfismo downcast
    //Conteudo conteudo = new Curso();

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria java");
    mentoria.setDescricao("descrição mentoria java");
    mentoria.setData(LocalDate.now());

    //System.out.println(curso1);
    //System.out.println(curso2);
    //System.out.println(mentoria);

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descrição Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devMarcio = new Dev();
    devMarcio.setNome("Márcio");
    devMarcio.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos inscritos Márcio: " + devMarcio.getConteudosInscritos());

    devMarcio.progredir();
    devMarcio.progredir();
    System.out.println("-");
    System.out.println("Conteúdos conclúidos Márcio: " + devMarcio.getConteudosConcluidos());
    System.out.println("Conteúdos inscritos Márcio: " + devMarcio.getConteudosInscritos());
    System.out.println("XP: "+devMarcio.calcularTotalXp());
    
    
    System.out.println("-----------");
    
    
    Dev devJoao = new Dev();
    devJoao.setNome("João");
    devJoao.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosInscritos());

    devJoao.progredir();
    System.out.println("-");
    System.out.println("Conteúdos conclúidos João: " + devJoao.getConteudosConcluidos());
    System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosInscritos());
    System.out.println("XP: "+devJoao.calcularTotalXp());
  }
}
