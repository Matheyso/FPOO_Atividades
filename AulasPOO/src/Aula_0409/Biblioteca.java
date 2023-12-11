package Aula_0409;

import java.util.List;

public class Biblioteca {
	//atributos
	private List<Livro> livros;//varios livros
	//construtor
	Biblioteca(){
		
	}
	Biblioteca(List<Livro> livros){
		this.livros = livros;
	}
	//get e set
	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	//met especial
	public List<Livro> getTotalLivrosBiblioteca() {
		return livros;
		
	}
}
