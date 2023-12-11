package Aula_0409;

import java.util.List;

public class Turma {
	//atb
	public String nome;
	private List<Estudante> estudantes;//agregação
	//met construtor
	Turma(){
		
	}
	Turma(String nm, List<Estudante> est){
		this.nome = nm;
		this.estudantes = est;
	}
	//get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nm) {
		this.nome = nm;
	}
	public List<Estudante> getEstudantes() {
		return estudantes;
	}
	public void setEstudantes(List<Estudante> est) {
		this.estudantes = est;
	}
}
