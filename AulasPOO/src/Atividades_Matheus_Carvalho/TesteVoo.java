package Atividades_Matheus_Carvalho;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TesteVoo {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	//dados do cliente
	
	//System.out.println("Insira seus dados a seguir");
	//System.out.println("Informe seu nome: ");
	//String varNome = entrada.nextLine();
	//System.out.println("Informe seu sobrenome: ");
	//String varSob = entrada.nextLine();
	//System.out.println("Informe seu email: ");
	//String varEmail = entrada.nextLine();
	//inst obj cli
	//ClienteVoo c1 = new ClienteVoo(varNome, varSob, varEmail);
	//System.out.println("Informe o local de origem: ");
	//String oriVoo = entrada.nextLine();
	//System.out.println("Informe o local de destino");
	//String destVoo = entrada.nextLine();
	ClienteVoo c1 = new ClienteVoo();
	Voo v1 = new Voo(001, 1200.50);
	Voo v2 = new Voo(002, 1500.50);
	Voo v3 = new Voo(003, 1499.90);
	
	
	System.out.println("Insira seus dados a seguir");
	System.out.println("Informe seu nome: ");
	c1.setNome(entrada.next());
	System.out.println("Informe seu sobrenome: ");
	c1.setSobrenome(entrada.next());
	System.out.println("Informe seu email: ");
	c1.setEmail(entrada.next());
	
	System.out.println("Informe o local de origem: ");
	v1.setOrigem(entrada.next());
	System.out.println("Informe o local de destino");
	v1.setDestino(entrada.next());
	
	
	int opcaoVoo;
	do {
		exibirMenu();
		opcaoVoo = entrada.nextInt();
		switch(opcaoVoo) {
		case 1:
			System.out.println("Voce escolheu o voo 1");
			c1.mostrarDetalhes();
			v1.mostrarDetalhes();
		break;
		case 2:
			System.out.println("Voce escolheu o voo 2");
			c1.mostrarDetalhes();
			v2.mostrarDetalhes();
			break;
		case 3: 
			System.out.println("Voce escolheu o voo 3");
			c1.mostrarDetalhes();
			v3.mostrarDetalhes();
			break;
		}
		System.out.println();
	}while(opcaoVoo <= 0);

		//System.out.println("Digite a data de volta (DD-MM-YYYY): ");
		//String DataV = entrada.nextLine();
		//dataVolta = LocalDate.parse(DataV, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	private static void exibirMenu() {
		System.out.println("Selecione um voo");
		System.out.println("1 - opcao 1");
		System.out.println("2 - opcao 2");
		System.out.println("3 - opcao 3");
		
	}
	

}
