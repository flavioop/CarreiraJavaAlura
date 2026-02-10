package Exercicios;

public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("Classe calculadora");
		
		Calculadora calculadora = new Calculadora();
		
		System.out.println("O resultado da calculadora: " + calculadora.retornaDobro());
		
		System.out.println();
		System.out.println("Classe Pessoa");
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.ola();
		
		
		System.out.println();
		System.out.println("Classe Musica");
		Musica musica = new Musica();
		
		musica.media(10);
		musica.media(7);
		musica.media(6);
		musica.media(6);
		
		System.out.println(musica.retornaAvaliacao());
		
		System.out.println();
		System.out.println("Classe Aluno");
		
		Aluno aluno = new Aluno();
		aluno.dados();
		
		
		
		
		
		
		
		
	}

}
