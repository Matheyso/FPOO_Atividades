package Aula_2108;

public class SubClasse2 extends SubClasse1{
	public String nome2;
	//metodo construtor
	public SubClasse2() {
		
		System.out.println("Senha vista pela SubClasse2 " + getSenha());
		System.out.println("Nome visto pela SubClasse2 " + nome);
	}
	public String getNome2() {
		return nome2;
	}
	public void setNome2(String nome) {
		this.nome = nome2;
	}
	
}
