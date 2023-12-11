package Atividades_Matheus_Carvalho;

public class ClienteTeste {
	public static void main(String[] args) {
		//instanciando objetos da classe Cliente
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		System.out.println("dados do cliente 1:");
		System.out.println(" ");
		//Cliente 1 (c1)
		c1.cpf = "123.456.789.00";
		System.out.println("O CPF do c1 e: " + c1.cpf);
		//atribuimos o nome do cliente
		c1.nome = "Carlos Antonio";
		System.out.println("O nome do c1 e: " + c1.nome);
		//atribuindo o telefone do cliente
		c1.telefone = 1234567890;
		System.out.println("O telefone do c1 e: " + c1.telefone);
		//atribuindo idade do cliente
		c1.idade = 19;
		System.out.println("A idade do c1 e: " + c1.idade);
		//atribuindo altura do cliente
		c1.altura = 1.75;
		System.out.println("A altura do cliente e: " + c1.altura);
		//atribuindo peso do cliente
		c1.peso = 70;
		System.out.println("O peso do c1 e: " + c1.peso);
		c1.CalculadoraIMC( c1.altura ,  c1.peso);
	
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("dados do cliente 2:");
		System.out.println(" ");
		//Cliente 2 (c2)
		c2.cpf = "009.876.543.21";
		System.out.println("O CPF do c2 e: " + c2.cpf);
		//atribuimos o nome do cliente
		c2.nome = "Pinho";
		System.out.println("O nome do c2 e: " + c2.nome);
		//atribuindo o telefone do cliente
		c2.telefone = 1212343446;
		System.out.println("O telefone do c2 e: " + c2.telefone);
		//atribuindo idade do cliente
		c2.idade = 25;
		System.out.println("A idade do c2 e: " + c2.idade);
		//atribuindo altura do cliente
		c2.altura = 1.80;
		System.out.println("A altura do c2 e: " + c2.altura);
		//atribuindo peso do cliente
		c2.peso = 80.5;
		System.out.println("O peso do c2 e: " + c2.peso);
		c2.CalculadoraIMC( c2.altura ,  c2.peso);
	
	}

}

