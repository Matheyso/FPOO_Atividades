package Aula_2108;

public class TesteClasseComum {

	public static void main(String[] args) {
		//instanciar um obj
		ClasseComum obj1 = new ClasseComum();
		obj1.numero = 100;
		ClasseComum obj2 = new 	ClasseComum(10);
		obj2.idade = 200;
		obj2.numero = 50;
		System.out.println("Teste obj1: " + obj1.numero + " " + obj1.idade);
		System.out.println("Teste obj2: " + obj2.numero + " " + obj2.idade);

	}

}
