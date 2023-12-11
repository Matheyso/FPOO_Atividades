package Aula_2108;

public class ClassePai {
	private String senha;
	protected String nome = "Rock";
	private int idade = 50;
	//construtor
	public ClassePai(){
		System.out.println("Chamando construtor padrao da ClassePai" + nome);
	}
	public void metodoImprimir() {
		System.out.println("imprimi na ClassePai");	
}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return idade;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
		
	
}
