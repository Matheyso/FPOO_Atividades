package Atividades_Matheus_Carvalho;

public class Pessoa {
	//atributos
	private String nome;
	private String endereco;
	private int telefone;
	private int cpf;
	private int celular;
	//metodo construtor
	public Pessoa() {
		
	}
	Pessoa(String nm, String endr, int tel, int cpf, int cel) {
		this.nome = nm;
		this.endereco = endr;
		this.telefone = tel;
		this.cpf = cpf;
		this.celular = cel;
	}
	//metodos get and set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public int getCpf() {
		return cpf;
	}
	public void setNome(int cpf) {
		this.cpf = cpf;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
}
