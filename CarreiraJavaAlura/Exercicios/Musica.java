package Exercicios;

public class Musica {
	
	String titulo;
	String artista;
	int anoLancamento;
	int avaliacao;
	double somaAvaliacao;
	double mediaAvaliacao;
	
	void dadosMusica() {
		
		System.out.println("O titulo é: " + titulo);
		System.out.println("O nome do artista é: " + artista);		
		System.out.println("O ano de lançamento é: " + anoLancamento);
	}
	
	void media(int nota){
		
		somaAvaliacao += nota;
		mediaAvaliacao++;
		
		
	}
	
	
	double retornaAvaliacao() {
		return   somaAvaliacao / mediaAvaliacao;  
								
	}

	
	

}
