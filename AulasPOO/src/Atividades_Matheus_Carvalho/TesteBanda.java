package Atividades_Matheus_Carvalho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteBanda {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Banda ban1 = new Banda ();
		Vocalista men1 = new Vocalista();
		Baixista men2 = new Baixista();
		Baterista men3 = new Baterista();
		Guitarrista men4 = new Guitarrista();
		
		List<MembroBanda> metalica = new ArrayList();
		System.out.println("Informe nome da Banda: ");
		ban1.setNome(entrada.next());
		System.out.println("Adicionando os membros da Banda...");
		System.out.println("Informe o nome do novo vocalista: ");
		men1.setNome(entrada.next());
		metalica.add(men1);
		men1.adicionarMembro();
		System.out.println("Informe o nome do novo Baixista: ");
		men2.setNome(entrada.next());
		metalica.add(men2);
		men2.adicionarMembro();
		System.out.println("Informe o nome do novo Baterista");
		men3.setNome(entrada.next());
		metalica.add(men3);
		men3.adicionarMembro();
		System.out.println("Informe o nome do novo Guitarrista: ");
		men4.setNome(entrada.next());
		metalica.add(men4);
		men4.adicionarMembro();
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Foram adicionados os seguintes membros a Banda " + ban1.getNome());
		System.out.println("O nome do Vocalista e: " + men1.getNome());
		System.out.println("O nome do Baixista e: " + men2.getNome());
		System.out.println("O nome do Baterista e: " + men3.getNome());
		System.out.println("O nome do Guitarrista e: " + men4.getNome());
		
		ban1.realizarShow();
	}

}
