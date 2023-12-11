package Aula_2108;

public class SuperClasse {
	//atributos
	protected int a = 1234;
	protected int b = 6789;
	//metodo construtor
	SuperClasse(){
		
	}
	//metodos
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	//metodos especiais
	public String toStrnig() {
		return "Voce chamou o metodo String da SuperClasse";
		
	}
	
	
	
	
}
