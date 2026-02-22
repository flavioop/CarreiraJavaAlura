package br.com.alura.exercicios.produto;

public class ProdutoPerecivel extends Produto {
	
	String dataVAlidade;

	public ProdutoPerecivel(String nome, double preco, int quantidade, String dataVAlidade) {
		super(nome, preco, quantidade);
		this.dataVAlidade = dataVAlidade;
	}	

	
	
	
	

}
