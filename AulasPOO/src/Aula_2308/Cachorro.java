package Aula_2308;

public class Cachorro extends Animal1 {
	//atributos
	
	//metodo construtor
	public Cachorro(String nome) {
		super(nome);//pegando atributo nome da super classe Animal1
	}
	@Override //sobrescrita de metodos
	public void emitirSom() {
		System.out.println("O cachorro esta latindo... ");
	}
}
