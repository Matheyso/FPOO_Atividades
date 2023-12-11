package Atividades_Matheus_Carvalho;

public class Bolo extends ProdutoPadaria {
	//atributos
	private String cobertura;
	//metodos construtores

	Bolo(String nome, int preco){
		super.getNome();
		super.getPreco();
	}
	//get e set
	public String getCobertura() {
		return cobertura;
		
	}
	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
	//met especial
	public String passarCobertura() {
		System.out.println("A cobertura esta pronta...");
		return cobertura;
	}
}
