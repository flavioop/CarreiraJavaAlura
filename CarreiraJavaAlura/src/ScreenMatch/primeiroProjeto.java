package ScreenMatch;

public class primeiroProjeto {

	public static void main(String[] args) {
		
		System.out.println("Esse é o Screen Match");
		System.out.println("Filme: Top Gun: Maverick");
		
		int anoDeLancamento = 2022;
		boolean incluidoNoPlano = true;
		double notaFilme = 8.1;
		
		//media de calculo da nota do filme
		double media = (9.8 + 6.3 + 8.0) / 3;
		String sinopse;
		
		sinopse = """
				Filme Top Gun
				Filme de aventura com galã dos anos 80
				Muito Bom!
				Ano lançamento				
				""" + anoDeLancamento;
		
		System.out.println("Ano de lançamento: " + anoDeLancamento);
		System.out.println(media);
		
		System.out.println(sinopse);
		
		int classificacao = (int) (media/2);
		
		
		System.out.println(classificacao);
		

	}

}
