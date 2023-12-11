
package Atividades_Matheus_Carvalho;

public class ProdutoPadaria implements Produto {
	//atributos
	private String nome;
	double preco;
	//metodos construtores
	ProdutoPadaria(){
		
	}
	ProdutoPadaria(String nm, double prc){
		this.nome = nm;
		this.preco = prc;
	}
	//metodos get e set da interface
	@Override
	public String getNome() {
		return nome;
		
	}
	@Override
	public double getPreco() {
		return preco;
		
	}
	@Override
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	@Override
	public void setPreco(double preco) {
		this.preco = preco;
		
	}
	public void exibirInfoPao() {
		System.out.println("O Pao escolhido e: " + getNome() + " com o preco de: " + getPreco());
	}
	public void exibirInfoBolo() {
		System.out.println("O Bolo escolhido e: " + getNome() + " com o preco de: " + getPreco());
	}
	public void exibirInfoDoce() {
		System.out.println("O Doce escolhido e: " + getNome() + " com o preco de: " + getPreco());
	}
	
}
