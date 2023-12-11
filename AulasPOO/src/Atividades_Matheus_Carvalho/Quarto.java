package Atividades_Matheus_Carvalho;

public class Quarto extends Comodo{
	//atb
	private int numeroCamas;
	//met const
	Quarto() {
	super.getNome();
	}
	Quarto(int nmrcam) {
		this.numeroCamas = nmrcam;
	}
	//get e set
	public int getNumeroCamas() {
		return numeroCamas;
	}
	public void setNumeroCamas(int nmrcam) {
		this.numeroCamas = nmrcam;
	}

}
