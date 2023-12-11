package Atividades_Matheus_Carvalho;

public class Casa{
	//atributos
	private String cor;
	private float preco;
	private float metragem;
	private Quarto nome;
	//met const
	Casa() {
		
	}
	Casa(String cor, float preco, float met) {
		this.cor = cor;
		this.preco = preco;
		this.metragem = met;
	}
	//met set e get
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getMetragem() {
		return metragem;
	}
	public void setMetragem(float metragem) {
		this.metragem = metragem;
	}
	public Quarto getNome() {
		return nome;
	}
	public void setNome(Quarto nome) {
		this.nome = nome;
	}
	//public Quarto getQuartos() {
		//return quartos;
	//}
	//public void setQuartos(Quarto quartos) {
		//this.quartos = quartos;
	//}
	//met especiais
	
	public void mostrarDetalhes() {
		System.out.println("A cor da casa e: " + getCor());
		System.out.println("O preco da casa e: " + getPreco());
		System.out.println("A metragem da casa e: " + getMetragem());
	}

}
