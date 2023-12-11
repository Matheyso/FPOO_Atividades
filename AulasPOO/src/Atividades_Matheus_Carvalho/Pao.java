package Atividades_Matheus_Carvalho;

public class Pao extends ProdutoPadaria {
	//atributos
	private String massa;
	//metodos construtores
	Pao(String nome, int preco){
		super.getNome();
		super.getPreco();
	}
	//get e set
	public String getMassa() {
		return massa;
		
	}
	public void setMassa(String massa) {
		this.massa = massa;
		
	}
	//met especial
	public String assar() {
		System.out.println("O pao esta assando...");
		return massa;
	}
}
