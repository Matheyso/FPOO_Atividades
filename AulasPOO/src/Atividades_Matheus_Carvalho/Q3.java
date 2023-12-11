package Atividades_Matheus_Carvalho;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num_aleatorio = (int) (Math.random() * 100) + 1;
		int tentativas;
		int contador = 0;
		System.out.println("Start...");
		do {//faça
			System.out.println("Digite um numero de 1 a 30: ");
			tentativas = entrada.nextInt();
			contador++;
			if(tentativas < num_aleatorio) {
				System.out.println("Digite um maior!");
			}else if(tentativas < num_aleatorio)	{
				System.out.println("Digite um menor!");
			}else{
				System.out.println("Acertou!!!!!!!Parabensssssssssssss!!!!");
			}
				
			}while(tentativas != num_aleatorio);//enquanto
			System.out.println("Volte Sempre!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

	}

}
