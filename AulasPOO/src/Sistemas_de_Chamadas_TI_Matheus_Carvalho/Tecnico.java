package Sistemas_de_Chamadas_TI_Matheus_Carvalho;

public class Tecnico {
	//atributos
	private String nome;
	private String funcao;
	private int nmrI;
	//met const
	Tecnico() {
		
	}
	Tecnico(String nm,String func, int nmrI) {
		this.nome = nm;
		this.funcao = func;
		this.nmrI = nmrI;

	}
	//get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nm) {
		this.nome = nm;
	}
	public String getDuncao() {
		return funcao;
	}
	public void setFuncao(String func) {
		this.funcao = func;
	}
	public int getNmrI() {
		return nmrI;
	}
	public void setNmrI(int nmrI) {
		this.nmrI = nmrI;
	}
	//met esp
	public void receberChamados() {
		System.out.println("Qual o problema? Selecione uma das opcoes abaixo: ");
		System.out.println("1 - Falha de Hardware");
		System.out.println("2 - Erro de Configuracao");
		System.out.println("3 - Trafego sobrecarregado");
		System.out.println("4 - Outro");
	}

}
