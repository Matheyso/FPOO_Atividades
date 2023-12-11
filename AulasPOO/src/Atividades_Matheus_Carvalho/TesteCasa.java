package Atividades_Matheus_Carvalho;

import java.util.Scanner;

public class TesteCasa {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
		Casa c1 = new Casa();
		Casa c2 = new Casa();
		Quarto q1 = new Quarto();
		Sala s1 = new Sala();
		
		System.out.println("Informe os dados da Casa");
		System.out.println("Informe a cor da Casa: ");
		c1.setCor(entrada.next());
		System.out.println("Informe o preco da Casa: ");
		c1.setPreco(entrada.nextFloat());
		System.out.println("Informe a metragem da Casa: ");
		c1.setMetragem(entrada.nextFloat());
		System.out.println("Informe o nome do Quarto: ");
		q1.setNome(entrada.next());
		System.out.println("Informe o numero de camas do(a) " + q1.getNome());
		q1.setNumeroCamas(entrada.nextInt());
		System.out.println("Informe o nome da Sala: ");
		s1.setNome(entrada.next());
		System.out.println("Informe se a sala tem Tv: ");
		s1.setTemTv(entrada.nextBoolean());
		
		c1.mostrarDetalhes();
		System.out.println("O numero de camas do quarto do(a) " + q1.getNome() + " e de " + q1.getNumeroCamas());
		System.out.println("A sala tem tv? " + s1.getTemTv());
		
		

	}

}
