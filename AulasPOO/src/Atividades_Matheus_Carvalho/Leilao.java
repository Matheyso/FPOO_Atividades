package Atividades_Matheus_Carvalho;

import java.util.Scanner;

public class Leilao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escreva o numero de lances: ");
		int v=0;
		int [] n= {v};
		String c= null; //variavel vazia
		String []n1 = {c};
		int numero = 0;
		for (int i = 0; i < numero; i++) {// (for) com maior compatibilidade com o vetor
			System.out.println("Escreva o nome: ");
			String c1 = entrada.next();// nao usar nextInt por não ser numero e sim caractere
			System.out.println("Escreva o valor dos lances: ");
			int lance = entrada.nextInt();
			if(lance > n[0]) {// (if)caso acontecesse do lançe ser maior que o vetor, ele faria a substituição necessária
				n[0] = lance;
				n1[0] = c1;
			}
		}
		System.out.printf("O nome do Licitante e: %s\n", n1[0]);
		System.out.printf("O valor dado e:%d", n[0]);
		
		
		
		
	}

}
