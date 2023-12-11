package Atividades_Matheus_Carvalho;

import java.util.Scanner;


public class Cobra {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		int d = entrada.nextInt();
		if ( a==c || b==d ) {
			System.out.println("Verdadeiro");
		}else {
			System.out.println("Falso");
		}

	}

}
