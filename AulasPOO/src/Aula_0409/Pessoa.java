package Aula_0409;

public class Pessoa {
	public String cargo;
	public String nome;
	public int idade;
	
	Pessoa(){
		
	}
	Pessoa(String carg, String nm, int idd){
		this.cargo = carg;
		this.nome =nm;
		this.idade = idd;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
