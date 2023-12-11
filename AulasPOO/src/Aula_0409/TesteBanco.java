package Aula_0409;

public class TesteBanco {

	public static void main(String[] args) {
		Banco ban1 = new Banco("Bradesco");
		Empregado emp1 = new Empregado("Joao");
		 System.out.println("O Empregado " + emp1.getNome() + " trabalha no banco " + ban1.getNome());
		

	}

}
