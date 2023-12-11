package Aula_1406;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		//criando (instanciando) a lista vazia de tipo INTEIRO
		ArrayList<Integer>lista = new ArrayList<Integer>(5);
		//adicionar numeros (elementos/itens) na lista
		lista.add(10);
		lista.add(20);
		lista.add(-50);
		lista.add(100);
		lista.add(35);
		//ler os valores que estão na lista
		for(Integer olho : lista) {
			System.out.println("número = " + olho);
		}
		int ver_conteudo = lista.get(2);
		System.out.println("Conteúdo é" + ver_conteudo);
		int tamanho = lista.size();
		System.out.println("Tamanho da lista: " + tamanho);
	}

}
