package Atividades_Matheus_Carvalho;

import java.util.List;
import java.util.ArrayList;

public class Banda {
	//atributos
	private String nome;
	private List<MembroBanda> membros;
	//met const
	Banda() {
		
	}
	Banda(String nm) {
		this.nome = nm;
	}
	//get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<MembroBanda> getMembros(){
		return membros;
	}
	public void setMembros(List<MembroBanda> membros) {
		this.membros = membros;
	}
	//met especial
	public void adicionarMembro() {
		System.out.println("O membro " + getNome() + " foi adicionado ao grupo da banda");
	}
	public void realizarShow() {
		System.out.println("Os membros se juntaram e gritaram todos juntos: QUE COMECE O SHOOWWW!!! ( a banda " + getNome() + " comecou o show)");
	}

}
