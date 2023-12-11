package Aula_0409;

public class TesteCao {

	public static void main(String[] args) {
		Cachorro c1 = new Cachorro("Pluto", 5, 'M', 4);
		Cachorro c2 = new Cachorro("Belinha", 2, 'F', 4);
		Cachorro c3 = new Cachorro("Fred", 10, 'M', 3);
		
		System.out.println("O nome do cachorro 1 e: " + c1.getNome() + " peso: " + c1.getPeso() + " Sexo: " + c1.getSexo() + " Qnt de patas: " + c1.QtdPatas());
		System.out.println("O nome do cachorro 2 e: " + c2.getNome() + " peso: " + c2.getPeso() + " Sexo: " + c2.getSexo() + " Qnt de patas: " + c2.QtdPatas());
		System.out.println("O nome do cachorro 3 e: " + c3.getNome() + " peso: " + c3.getPeso() + " Sexo: " + c3.getSexo() + " Qnt de patas: " + c3.QtdPatas());
		
		System.out.println("--------------------------------");
		
		c1.Latir();
		c1.Correr();
		c1.Dormir();
		c1.Brincar();
		
		System.out.println("--------------------------------");
		
		c2.Latir();
		c2.Correr();
		c2.Dormir();
		c2.Brincar();
		
		System.out.println("--------------------------------");
		
		c3.Latir();
		c3.Correr();
		c3.Dormir();
		c3.Brincar();
	}

}
