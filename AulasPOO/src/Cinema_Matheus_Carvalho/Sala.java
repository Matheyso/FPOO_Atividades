package Cinema_Matheus_Carvalho;

public class Sala {
	private int numero;
	private int capacidade;
	Sala() {
		
	}
	Sala(int numero, int capacidade) {
		this.numero = numero;
		this.capacidade = capacidade;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

}
