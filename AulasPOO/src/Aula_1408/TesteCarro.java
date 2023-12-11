package Aula_1408;

public class TesteCarro {

	public static void main(String[] args) {
		//instanciando objetos da classe Carro
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		Carro c3 = new Carro("Porshe", 2.0f);
		System.out.println("Carro 3: " + c3);
		
		//carro 1
		c1.modelo = "Ferrari";
		System.out.println("O modelo do c1 e: " + c1.modelo);
		//atribuimos o valor da potencia para o carro
		c1.setPotencia(1000);
		System.out.println("A potencia e de : " + c1.getPotencia() + " Cavalos");
		//verificando o estado do carro (parado ou em movimento?)
		c1.isParado();
		System.out.println("Estado do carro esta parado? " + c1.isParado());
		//vou modificar o estado do carro
		c1.setParado(true);
		//vou frear o carro
		System.out.println("pisando no acelerador " + c1.getAcelerar());
		System.out.println("Pisando no freio " + c1.getFrear());
		
		
		
		//carro 2
		c2.modelo = "";
		System.out.println("O modelo do c2 e: " + c2.modelo);
		//c2.setPotencia();
		System.out.println("A potencia e de : " + c2.getPotencia() + " Cavalos");
		
		//carro 3
		
		System.out.println("O modelo do c3 e: " + c3.modelo);
		
		System.out.println("A potencia e de : " + c3.getPotencia() + " Cavalos");
	}

}
