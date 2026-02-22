package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
	
	public static void main(String[] args) {
		
		Musica minhaMusica = new Musica();
		minhaMusica.setTitulo("Forever");
		minhaMusica.setCantor("Kiss");
		
		for (int i = 0; i > 100; i++) {
			minhaMusica.reproduzir();			
			
		}
		
		Podcast meuPodcast = new Podcast();
		meuPodcast.setTitulo("BolhaDev");
		meuPodcast.setApresentador("Marcos mendes");
		
		for(int i = 0; i < 5000; i++) {
			meuPodcast.reproduzir();
			
		}
		
		for(int i = 0; i < 5000; i++) {
			meuPodcast.curtir();
		}
		
	MinhasPreferidas preferidas = new MinhasPreferidas();
	preferidas.inclui(meuPodcast);
	preferidas.inclui(minhaMusica);
		
		
		
		
		
	}

}
