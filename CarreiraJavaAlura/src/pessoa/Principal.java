package br.com.alura.exercicios.pessoa;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();		
		pessoa.setNome("Nayla");
		pessoa.setIdade(8);
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Viviane");
		pessoa1.setIdade(49);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Flávio");
		pessoa2.setIdade(44);
		
		
		
		ArrayList<Pessoa> listaPessoas = new ArrayList<>();
		listaPessoas.add(pessoa);
		listaPessoas.add(pessoa1);
		listaPessoas.add(pessoa2);
		
		System.out.println(listaPessoas.size());
		System.out.println(listaPessoas.get(0));
		System.out.println(listaPessoas.toString());
		
		
	
		
		
		

	}

}
