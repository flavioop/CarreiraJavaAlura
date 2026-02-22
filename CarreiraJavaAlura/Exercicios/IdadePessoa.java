package Exercicios;

public class IdadePessoa {
	
	private String nome = "";
	private int idade = 22;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void maiorIdade() {
		
		if(this.idade >=  18) {
			
			System.out.println("Pessoa maior de idade 1");			
		}else {
			System.out.println("Pessoa menor de idade 1");
		}
	}
	
	
	public int maioridade(int idade) {
		
		if(this.idade >=  18) {
			
			System.out.println("Pessoa maior de idade 2");			
		}else {
			System.out.println("Pesso menor de idade 2");
		}
		
		return idade;
		
	}
	
	
	

}
