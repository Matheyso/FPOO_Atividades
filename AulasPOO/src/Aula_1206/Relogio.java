package Aula_1206;

import java.util.Scanner;

public class Relogio {

	public static void main(String[] args) {
		int r = 0;
		int f = 0;
		int c = 0;
		
		if(r > 3*f || c < 95) {
			System.out.println("diminuir a frequência");
		}else if (f < 2*r && c > 97) {
			System.out.println("diminuir a frequência");
		}else{
			System.out.println("manter a frequência");
		}
	}

}
