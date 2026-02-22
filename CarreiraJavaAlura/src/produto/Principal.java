package br.com.alura.exercicios.produto;

import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto("Leite", 7.00, 5);
		/*produto.setNome("Leite");
		produto.setPreco(7.00);
		produto.setQuantidade(5);*/

		Produto produto1 = new Produto("Carne", 37.00, 25);
		/*produto1.setNome("Carne");
		produto1.setPreco(37.00);
		produto1.setQuantidade(25);*/
		
		Produto produto2 = new Produto("Arroz", 12.00, 35);
		/*produto2.setNome("Arroz");
		produto2.setPreco(12.00);
		produto2.setQuantidade(35);*/	
		
		ProdutoPerecivel perecivel = new ProdutoPerecivel("Sorvete", 8.75, 50, "25/12/2026");


		
		ArrayList<Produto> listaProduto = new ArrayList<>();
		listaProduto.add(produto);
		listaProduto.add(produto1);
		listaProduto.add(produto2);
		
		ArrayList<ProdutoPerecivel> listaPerecivel = new ArrayList<>();
		
		listaPerecivel.add(perecivel);
		
		System.out.println("O tamanho da lista: " + listaProduto.size());
		System.out.println("O produto no segundo indece da lista: " + listaProduto.get(1).nome);
		System.out.println("Lista de produtos: " + listaProduto.toString());
		System.out.println();
		System.out.println("Lista de produtos pereciveis: " + listaPerecivel.toString());
		
		
		
		
	}

}
