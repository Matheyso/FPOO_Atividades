package Aula_0409;

public class Livro {
	//atributos
	public String titulo;
	public String autor;
	//met const
	Livro(){
		
	}
	Livro(	String titulo, String autor){
		this.titulo = titulo;
		this.autor = autor;
	}
	//get e set
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
}
