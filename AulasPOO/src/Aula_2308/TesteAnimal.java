package Aula_2308;

public class TesteAnimal {

	public static void main(String[] args) {
		//instância de objetos
		System.out.println("--------------INICIO ANIMAL--------------");
		Animal ani1 = new Animal();
		ani1.nome = "Pica-Pau";
		System.out.println("Animal criado: " + ani1.nome);
		Animal ani2 = new Animal();
		ani2.nome = "Cachorro";
		System.out.println("Animal criado: " + ani2.nome);
		//instância de objeto da classe Gato
		System.out.println("-------------FIM ANIMAL--------------");
		
		
		System.out.println("--------------INICIO GATO1--------------");
		Gato gato1 = new Gato();
		gato1.nome = "Theo";
		System.out.println("Nome: " + gato1.nome);
		gato1.brincar();
		System.out.println("--------------FIM GATO1--------------");
		
		
		System.out.println("--------------INICIO GATO2--------------");
		Gato gato2 = new Gato("Persa");
		gato2.som();
		System.out.println("--------------FIM GATO2--------------");
		
		
		System.out.println("--------------INICIO GATO3--------------");
		Gato gato3 = new Gato(2.5f, 1);
		System.out.println("--------------FIM GATO3--------------");
	}

}
