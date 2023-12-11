package Atividades_Matheus_Carvalho;

public class Passagem {
	//atributos
	private Voo voo;
	private Cliente cliente;
	private double precoTotal;
	//met const
	Passagem(){
		
	}
	Passagem(Voo voo, Cliente cliente, double precoTotal){
		this.voo = voo;
		this.cliente = cliente;
		this.precoTotal = precoTotal;
	}
	//met get e set
	public Voo getVoo() {
		return voo;
	}
	public void setVoo(Voo voo) {
		this.voo = voo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
	//met especial
	public String toString() {
		return null;
	}
}
