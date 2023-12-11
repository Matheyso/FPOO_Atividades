package Aula_1206;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		//instância ("criar") de objeto objin
		Scanner objin = new Scanner (System.in);
		int a = objin.nextInt();
		int b = objin.nextInt();
		if (a > b) {
			System.out.printf("valor de a: %d\n" + a);
		}else
			System.out.printf("%d\n" + b);

	}

}
