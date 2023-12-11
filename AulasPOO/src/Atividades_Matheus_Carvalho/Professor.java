package Atividades_Matheus_Carvalho;

public class Professor extends Pessoa {
	//atributos
	private String nomeCurso;
	private float salario;
	//metodo construtor
	Professor(){
		
	}
	Professor(String nmcur, float sal){
		this.nomeCurso = nmcur;
		this.salario = sal;
	}
	//metodos get and set
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
}
