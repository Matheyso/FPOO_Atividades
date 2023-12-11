package Aula_0409;

public class Empregado1 {
	//atrb
	private int salario;
	private Pessoa funcionario;//composição muda o tipo do atributo
	//met const
	Empregado1(){
		
	}
	Empregado1(int sal, Pessoa fun ){
		this.salario = sal;
		this.funcionario = fun;
	}
	//get e set
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public Pessoa getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Pessoa funcionario) {
		this.funcionario = funcionario;
	}
}
