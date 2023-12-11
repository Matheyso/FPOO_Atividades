package Atividades_Matheus_Carvalho;

public class Voo {
	//atb
	private int numeroVoo;
	private String origem;
	private String destino;
	private double preco;
	private LocalDate dataIda;
	private LocalDate dataVolta;
	//met const
	Voo(){
		
	}
	Voo(int nmrVoo, double preco){
		this.numeroVoo = nmrVoo;
		this.preco = preco;
	}
	Voo(int nmrVoo, double preco, LocalDate dataida, LocalDate dataVolta){
		this.numeroVoo = nmrVoo;
		this.preco = preco;
		this.dataIda = dataida;
		this.dataVolta = dataVolta;
	}
	//get e set
	public int getNumeroVoo() {
		return numeroVoo;
	}
	public void setNumeroVoo(int nmrVoo) {
		this.numeroVoo = nmrVoo;
	}
	public String getOrigem(){
		return origem;
	}
	public void setOrigem(String ori) {
		this.origem = ori;
	}
	public String getDestino() {
		return 	destino;
	}
	public void setDestino(String dest) {
		this.destino = dest;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public LocalDate getDataIda(){
		return dataIda;
	}
	public void setDataIda(LocalDate dataIda) {
		this.dataIda = dataIda;
	}
	public LocalDate getdataVolta() {
		return dataVolta;
	}
	public void setDataVolta(LocalDate dataVolta) {
		this.dataVolta = dataVolta;
	}
	//met especial
	public LocalDate DataEstaDisponivel() {
		return null;
		
	}
	public void mostrarDetalhes() {
		System.out.println("O numero do voo e: " + getNumeroVoo());
		System.out.println("O local de origem do voo e: " + getOrigem());
		System.out.println("O destino do voo e: " + getDestino());
		System.out.println("O preco do voo e: " + getPreco());
	}
}
