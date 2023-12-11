package Aula_2108;

public class SubClasse extends SuperClasse {
	//atributos
	protected int c;
	protected int d;
	//metodo construtor
	public SubClasse(){
		super();
	}
	public SubClasse(int a, int b, int c, int d){
		super.a = a;
		super.b = b;
		this.c = c;
		this.d = d;
	}
	//metodos
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	//metodos especiais
	public String toString() {
		return "Voce chamou o met. toString da SubClasse!";
	}
	
	
	
	
	
	
}
