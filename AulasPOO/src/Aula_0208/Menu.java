package Aula_0208;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int opcao;
		do {
			exibirMenu();//método (acao) construido fora do main
			opcao = entrada.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("opção 1 selecionada");
				break;
			case 2:
				System.out.println("opção 2 selecionada");
				break;
			case 3:
				System.out.println("opção 3 selecionada");
				break;
			default:
				System.out.println("escolha as opções de 1 a 3");
				break;
			}
			System.out.println();
			
	}while(opcao != 0);
		
	}//fim main
		
	//método para exibir menu de opções
	
	public static void exibirMenu() {
		System.out.println("Selecione uma opcao");
		System.out.println("1 - opcao 1");
		System.out.println("2 - opcao 2");
		System.out.println("3 - opcao 3");
		System.out.println("0 - SAIR");
	
}//fim classe
}
