package Atividades_Matheus_Carvalho;

public class Doce extends ProdutoPadaria {
	//atributos
	private String acucar;
	//metodos construtores
	Doce(String nome, int preco){
		super.getNome();
		super.getPreco();
	}
	//get e set
	public String getAcucar() {
		return acucar;
		
	}
	public void setAcucar(String acucar) {
		this.acucar = acucar;
		
	}
	//met especial
	public String misturar() {
		System.out.println("O acucar esta sendo mistrado...");
		return acucar;
	}
}
