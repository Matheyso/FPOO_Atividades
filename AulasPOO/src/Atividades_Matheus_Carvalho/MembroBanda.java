package Atividades_Matheus_Carvalho;

public class MembroBanda {
	//atributos
	private String nome;
	//met const
	MembroBanda() {
		
	}
	MembroBanda(String nome) {
		this.nome = nome;
	}
	//get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//met especial
	public void tocar() {
		
	}
	public void adicionarMembro() {
		System.out.println("O membro " + getNome() + " foi adicionado ao grupo da banda");
	}
	
}
