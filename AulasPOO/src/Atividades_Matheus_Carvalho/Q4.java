package Atividades_Matheus_Carvalho;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o num1: ");
		int num1 = entrada.nextInt();
		System.out.println("Digite o num2");
		int num2 = entrada.nextInt();
		System.out.println("O MMC de " + num1 + "e" + num2 + "é");
	}//fim mainjn
	//metodo chamado calcular mmc
	public static int calcularMMC(int num1, int num2) {
		int maior = Math.max(num1, num2);
		int mmc = maior;
		//System.out.println("Maximo:" + maior);
		while (true) {
			if(mmc % num1 == 0 && mmc % num2 == 0) {
				break;
			}
		}
		return mmc;
	}
}
