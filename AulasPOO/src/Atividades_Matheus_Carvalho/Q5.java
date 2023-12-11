package Atividades_Matheus_Carvalho;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		int opcao;
		do {
				System.out.println("Selecione uma opcao");
				System.out.println("1 - opcao Adicao");
				System.out.println("2 - opcao Subtracao");
				System.out.println("3 - opcao Divisao");
				System.out.println("4 - opcao Multiplicacao");
				System.out.println("0 - sair");
			
			opcao = entrada.nextInt();
			double resultado;
			switch (opcao) {
			case 1:
				System.out.println("Selecionado Adicao");
				System.out.println("Digite o 1° numero: ");
				double num1_1 = entrada.nextDouble();
				System.out.println("Digite o 2° numero: ");
				double num2_1 = entrada.nextDouble();
				resultado = num1_1 + num2_1;
				break;
			case 2:
				System.out.println("Selecionado Subtracao");
				System.out.println("Digite o 1° numero: ");
				double num1_2 = entrada.nextDouble();
				System.out.println("Digite o 2° numero: ");
				double num2_2 = entrada.nextDouble();
				resultado = num1_2 - num2_2;
				break;
			case 3:
				System.out.println("Selecionado Divisao");
				System.out.println("Digite o 1° numero: ");
				double num1_3 = entrada.nextDouble();
				System.out.println("Digite o 2° numero: ");
				double num2_3 = entrada.nextDouble();
				resultado = num1_3 / num2_3;
				break;
			case 4:
				System.out.println("Selecionado Multiplicacao");
				System.out.println("Digite o 1° numero: ");
				double num1_4 = entrada.nextDouble();
				System.out.println("Digite o 2° numero: ");
				double num2_4 = entrada.nextDouble();
				resultado = num1_4 * num2_4;
				break;
			case 0:
				System.out.println("escolha uma das opcoes");
				break;
			}
		}while(opcao != 0);
		

		
	}
}
