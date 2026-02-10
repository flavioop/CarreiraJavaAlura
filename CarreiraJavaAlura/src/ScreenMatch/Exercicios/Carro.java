package Exercicios;

public class Carro {
	
	String modelo;
	int ano;
	String cor;
	int anoAtual;
	int idadeCarro;
	
	void fichaTecnicaCarro(){
		
		System.out.println("O modelo do carro: "+ modelo);
		System.out.println("O ano do carro: " + ano );
		System.out.println("A cor do carro: " + cor );	
		
	}
	
	
	int anoAtual(int idadeCarro) {
		return   anoAtual - ano;
		
	}
	
	

}
