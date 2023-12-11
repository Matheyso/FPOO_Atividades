package Aula_0409;

import java.util.List;

public class Faculdade {
	//atb
	public String nomeFacul;
	private List<Turma> cursos;
	//met cons
	Faculdade(){
		
	}
	Faculdade(String nmf, List<Turma> cur){
		this.nomeFacul = nmf;
		this.cursos = cur;
	}
	//get e set
	public String getNomeFacul() {
		return nomeFacul;
	}
	public void setNomeFacul(String nmf) {
		this.nomeFacul = nmf;
	}
	public List<Turma> getCursos() {
		return cursos;
	}
	public void setCursos(List<Turma> cur) {
		this.cursos = cur;
	}
	//met especial para pegar o total de estudantes
	public int getTotalEstudantes() {
		int nEstudantes = 0;
		List<Estudante> estudante;
		for(Turma cur : cursos) {
			estudante = cur.getEstudantes();
			for(Estudante s : estudante) {
				nEstudantes++;
			}
		}
		return nEstudantes;
		
	}
}
