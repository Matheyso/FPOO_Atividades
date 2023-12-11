package Atividades_Matheus_Carvalho;

import java.util.Scanner;

public class TesteParque {

	public static void main(String[] args) {
	try (//Scanner e System
	Scanner entrada = new Scanner(System.in)) {
		//instancia de objetos
		System.out.println("Informe os dados do brinquedo 1");
		System.out.println("Nome: ");
		String nomeMontanhaRussa = entrada.nextLine();// pega a linha inteira da String
		System.out.println("Altura minima (em metros)");
		double alturaMinimaMontanhaRussa = entrada.nextDouble();
		System.out.println("Capacidade maxima: ");
		int capacidadeMaximaMontanhaRussa = entrada.nextInt();
		Brinquedo montanhaRussa = new Brinquedo(nomeMontanhaRussa, alturaMinimaMontanhaRussa, capacidadeMaximaMontanhaRussa);
		
		System.out.println("Informe os dados do Visitante 1");
		System.out.println("Nome: ");
		entrada.nextLine();
		String nomeVisitante1 = entrada.nextLine();
		System.out.println("Idade: ");
		int idadeVisitante = entrada.nextInt();
		System.out.println("Altura");
		double alturaVisitante = entrada.nextDouble();
		//instancia do objeto visitante 1
		//Visitante vis1 = new Visitante();
		Visitante visitante1 = new Visitante(nomeVisitante1, idadeVisitante, alturaVisitante);
		System.out.println("Informacoes do brinquedo 1: ");
		montanhaRussa.exibirInfo();
		
		
		System.out.println("Informacoes do visitante 1");
		visitante1.exibirInfo();
		//vamos verificar se o visitante pode ou nao andar no brinquedo
		System.out.println("pode andar na Montanha Russa? " +
		(visitante1.podeAndarNoBrinquedo() ? "Sim" : "Nao"));
	}
}

}
