package Aula_3008;

public class TesteTv {

	public static void main(String[] args) {
		//instanciando objetos...
		ControleRemoto televisao1 = new Tv();
		televisao1.desligar();
		televisao1.ligar();
		televisao1.volumeMais(1);
		televisao1.volumeMais(2);
		televisao1.volumeMenos(3);
		televisao1.volumeMenos(2);
		System.out.println("A Tv tem " + televisao1.getPolegadas() + " polegadas.");

	}

}
