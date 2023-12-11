package Aula_0409;

public class Cachorro {
	//atributos
	private String nome;
	private float peso;
	private char sexo;
	private int qtdPatas;
	Cachorro(String nome, float peso, char sexo, int qtdPatas){
		this.nome = nome;
		this.peso = peso;
		this.sexo = sexo;
		this.qtdPatas = qtdPatas;
	}
	Cachorro(){
		
	}
	//get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int QtdPatas() {
		return qtdPatas;
	}
	public void setQtdPatas(int qtdPatas) {
		this.qtdPatas = qtdPatas;
	}
	//met especial
	public String Latir() {
		System.out.println("o cachorro " + getNome() + " esta latindo...");
		return null;
	}
	public String Correr() {
		System.out.println("O cachorro "  + getNome() +  " esta correndo...");
		return null;
	}
	public String Dormir() {
		System.out.println("O cachorro "  + getNome() +  " esta dormindo...zzz");
		return null;
	}
	public String Brincar() {
		System.out.println("O cachorro "  + getNome() +  " esta brincando...");
		return null;
	}
}
