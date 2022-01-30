package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso Java");
		curso1.setDescricao("Descricao Curso Java");
		curso1.setCargaHoraria(8);
		
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso Js");
		curso2.setDescricao("Descricao Curso Js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descricao Mentoria Java ");
		mentoria.setData(LocalDate.now());
		
		
		
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricao Bootcamp Java Developer");
		bootcamp.getConteudo().add(curso1);
		bootcamp.getConteudo().add(curso2);
		bootcamp.getConteudo().add(mentoria);
		
		
		Dev devCamila = new Dev();
	    devCamila.setNome("Camila");
	    devCamila.inscreverBootcamp(bootcamp);
	    System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
	    devCamila.progredir();
	    devCamila.progredir();
	    System.out.println("-");
	    System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
	    System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
	    System.out.println("XP:" + devCamila.calcularTotalXp());
	
	    System.out.println("-------");
	
	    Dev devJoao = new Dev();
	    devJoao.setNome("Joao");
	    devJoao.inscreverBootcamp(bootcamp);
	    System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
	    devJoao.progredir();
	    devJoao.progredir();
	    devJoao.progredir();
	    System.out.println("-");
	    System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
	    System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
	    System.out.println("XP:" + devJoao.calcularTotalXp());
	}

}
	
	
	



