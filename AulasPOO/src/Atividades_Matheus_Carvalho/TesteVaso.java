package Atividades_Matheus_Carvalho;

import java.util.Scanner;
import java.util.ArrayList;


public class TesteVaso {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Vaso> vasos = new ArrayList<>();
		Vaso vs1 = new Vaso();
		Vaso vs2 = new Vaso();
		VasoDecorado vsd1 = new VasoDecorado();
		VasoDecorado vsd2 = new VasoDecorado();
		
		for (int i = 1; i <= 4; i++) {
			System.out.println("Vaso " + i);
		
		System.out.println("Informe os dados do Vaso");
		
		System.out.println("Cor do vaso: " );
		vs1.setCor (entrada.next());//chamou o atributo cor
		
		
		System.out.println("Tamanho do Vaso (em cm): ");
		vs1.setTamanho (entrada.nextDouble());
		
		System.out.println("Material do vaso: ");
		vs1.setMaterial (entrada.next());
		
		System.out.println("Decoracao do vaso: ");
		vsd1.setDecoracao (entrada.next());
		
		vs1.exibirInfo();
		vsd1.exibirInfo();
		
		for(Vaso vaso : vasos) {
			vaso.exibirInfo();
			System.out.println();
		}
		
		}
	}

}
