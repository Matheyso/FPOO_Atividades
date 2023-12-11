package Atividades_Matheus_Carvalho;

public class Sala extends Comodo{
	//atributos
	private boolean temTv; 
	//met const
	Sala() {
		super.getNome();
	}
	Sala(boolean temTv) {
		this.temTv = temTv;
	}
	//met get e set
	public boolean getTemTv() {
		return temTv;
	}
	public void setTemTv(boolean temTv) {
		this.temTv = temTv;
	}
	//met especial
	

}
