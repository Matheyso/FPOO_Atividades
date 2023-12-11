package Atividades_Matheus_Carvalho;

public class Vaso {
	//Atributos
	private String cor;
	private double tamanho;
	private String material;
	//metodos construtores
	Vaso(){
		
	}
	Vaso(String cor, double tamanho, String material){
		this.cor = cor;
		this.tamanho = tamanho;
		this.material = material;
	}
	//metodos getters and setters
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	//exibindo informações
	public void exibirInfo() {
		System.out.println("Cor do vaso: " + cor);
		System.out.println("Tamanho do Vaso: " + tamanho);
		System.out.println("Material usado: " + material);
	}
}
