package br.com.alura.minhasmusicas.modelos;

public class Audio {

	private String titulo;
	private double duracao;
	private int totalDeReproducoes;
	private int curtidas;
	private int classificacao;
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public double getDuracao() {
		return duracao;
	}
	
	
	public int getTotalDeReproducoes() {
		return totalDeReproducoes;
	}
	
	
	
	public int getCurtidas() {
		return curtidas;
	}
	
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	
	public int getClassificacao() {
		return classificacao;
	}
	
	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}	
	
	
	public void curtir() {
		this.curtidas ++;
	}
	
	
	public void reproduzir() {
		this.totalDeReproducoes ++;
	}
	
}
