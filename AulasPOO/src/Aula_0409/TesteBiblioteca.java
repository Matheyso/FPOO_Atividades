package Aula_0409;

import java.util.ArrayList;
import java.util.List;

public class TesteBiblioteca {

	public static void main(String[] args) {
		//instanciando objetos, mas qual??????????????????????????????????????????????????????????
		Livro lv1 = new Livro("Aridante, ", " Benjamin");
		Livro lv2 = new Livro("Ruina e Ascensao, ", " GrishaVerso");
		//instancia da lista vazia
		List<Livro> lista_livro = new ArrayList<Livro>();
		//adicionando objeto livro no obj lista_livro
		lista_livro.add(lv1);
		lista_livro.add(lv2);
		//quero ler os livros que estao na lista
		for( Livro ver_lista : lista_livro) { 
			System.out.println("Livros na lista: " + ver_lista.titulo + ver_lista.autor);
		}
		//instanciar a biblioteca
		Biblioteca bib = new Biblioteca(lista_livro);
		List<Livro> li = bib.getTotalLivrosBiblioteca();
		for(Livro livr : li) {
			System.out.println("Titulo: " + livr.titulo + "Autor: " + livr.autor);
		}
		System.out.println("t " + li.removeAll(li));
		bib.toString();
	}

}
