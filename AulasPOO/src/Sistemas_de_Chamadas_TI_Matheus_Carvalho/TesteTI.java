package Sistemas_de_Chamadas_TI_Matheus_Carvalho;

import java.util.Scanner;

import javax.swing.JOptionPane;

import Atividades_Matheus_Carvalho.MembroBanda;

import java.util.ArrayList;
import java.util.List;

public class TesteTI {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
		Cliente c1 = new Cliente();
		Tecnico t1 = new Tecnico("Jeferson", "Ajustes Gerais", 1789);
		Tecnico t2 = new Tecnico("Alex", "Suporte Configuracional", 1290);
		Tecnico t3 = new Tecnico("Monkey D Luffy", "Suporte de Trafego", 1665);
		Tecnico t4 = new Tecnico("Nelson", "Problemas especificos", 1002);
		Central ce1 = new Central(237);
		Problema p1 = new Problema("Falha de Hardware", true);
		Problema p2 = new Problema("Erro de Configuracao", true);
		Problema p3 = new Problema("Trafego Sobrecarregado", false);
		Problema p4 = new Problema("Outro", true);
		List<Cliente> clientList = new ArrayList<Cliente>();
		
		JOptionPane.showMessageDialog(null, "Seja bem vindo ao nosso Suporte Tecnico!");
		clientList.add(c1);
		System.out.println("Informe seu nome: ");
		c1.setNome(entrada.nextLine());
		System.out.println("Informe seu Sobrenome: ");
		c1.setSobrenome(entrada.nextLine());
		System.out.println("Informe seu endereco(Rua, n, complemento):");
		c1.setEndereco(entrada.nextLine());
		System.out.println("Informe seu Email favorito: ");
		c1.setEmail(entrada.nextLine());
		
		System.out.println("Os tecnicos da agencia " + ce1.getNmrAgencia() + " irao lhe atender");
		
		int opcaoPb;
		do {
			t1.receberChamados();
			opcaoPb = entrada.nextInt();
			switch(opcaoPb) {
			case 1:
				System.out.println("Voce selecionou o problema de " + p1.getTipo() + " e o tecnico " + t1.getNome() + " vai lhe atender imediatamente");
				System.out.println("O tecnico " + t1.getNome() + " esta a caminho do endereco " + c1.getEndereco() + "...");
				System.out.println("O tecnico chegou ate o local e o problema foi solucionado com sucesso pelo tecnico " + t3.getNome() + "!");
				System.out.println("---------------------------------------------");
				System.out.println("Iniciando relatorio...");
				System.out.println("Nome do cliente atendido: " + c1.getNome() + " " + c1.getSobrenome());
				System.out.println("Endereco: " + c1.getEndereco());
				System.out.println("Email fornecdo: " + c1.getEmail());
				System.out.println("Tecnico designado: " + t1.getNome());
				System.out.println("Numero de Identificacao do Tecnico: " + t1.getNmrI());
				System.out.println("Problema encontrado: " + p1.getTipo());	
				System.out.println("Obrigado por usar nossa companhia!");
				System.out.println("Por favor, avalie-nos!(nota de 1 a 5):");
				p1.setAvaliacao(entrada.nextInt());
				System.out.println("Obrigado!! ;)");
			break;
			case 2:
				System.out.println("Voce selecionou o problema de " + p2.getTipo() + " e o tecnico " + t2.getNome() + " vai lhe atender imediatamente");
				System.out.println("O tecnico " + t2.getNome() + " esta a caminho do endereco " + c1.getEndereco() + "...");
				System.out.println("O tecnico chegou ate o local e o problema foi solucionado com sucesso pelo tecnico " + t2.getNome() + "!");
				System.out.println("---------------------------------------------");
				System.out.println("Iniciando relatorio...");
				System.out.println("Nome do cliente atendido: " + c1.getNome() + " " + c1.getSobrenome());
				System.out.println("Endereco: " + c1.getEndereco());
				System.out.println("Email fornecdo: " + c1.getEmail());
				System.out.println("Tecnico designado: " + t2.getNome());
				System.out.println("Numero de Identificacao do Tecnico: " + t2.getNmrI());
				System.out.println("Problema encontrado: " + p2.getTipo());	
				System.out.println("Obrigado por usar nossa companhia!");
				System.out.println("Por favor, avalie-nos!(nota de 1 a 5):");
				p2.setAvaliacao(entrada.nextInt());
				System.out.println("Obrigado!! ;)");
				break;
			case 3: 
				System.out.println("Voce selecionou o problema de " + p3.getTipo() + " e o tecnico " + t3.getNome() + " vai lhe atender daqui a pouco...");
				System.out.println("O tecnico " + t3.getNome() + " esta a caminho do endereco " + c1.getEndereco() + "...");
				System.out.println("O tecnico chegou ate o local e o problema foi solucionado com sucesso pelo tecnico " + t3.getNome() + "!");
				System.out.println("---------------------------------------------");
				System.out.println("Iniciando relatorio...");
				System.out.println("Nome do cliente atendido: " + c1.getNome() + " " + c1.getSobrenome());
				System.out.println("Endereco: " + c1.getEndereco());
				System.out.println("Email fornecdo: " + c1.getEmail());
				System.out.println("Tecnico designado: " + t3.getNome());
				System.out.println("Numero de Identificacao do Tecnico: " + t3.getNmrI());
				System.out.println("Problema encontrado: " + p3.getTipo());	
				System.out.println("Obrigado por usar nossa companhia!");
				System.out.println("Por favor, avalie-nos!(nota de 1 a 5):");
				p3.setAvaliacao(entrada.nextInt());
				System.out.println("Obrigado!! ;)");
				break;
			case 4:
				System.out.println("Infome seu problema abaixo: ");
				p4.setTipo(entrada.next());
				
				System.out.println("O problema informado foi: " + p4.getTipo() + " e o tecnico " + t4.getNome() + " vai lhe atender daqui a pouco...");
				System.out.println("O tecnico " + t4.getNome() + " esta a caminho do endereco " + c1.getEndereco() + "...");
				System.out.println("O tecnico chegou ate o local e o problema foi solucionado com sucesso pelo tecnico " + t4.getNome() + "!");
				System.out.println("---------------------------------------------");
				System.out.println("Iniciando relatorio...");
				System.out.println("Nome do cliente atendido: " + c1.getNome() + " " + c1.getSobrenome());
				System.out.println("Endereco: " + c1.getEndereco());
				System.out.println("Email fornecdo: " + c1.getEmail());
				System.out.println("Tecnico designado: " + t4.getNome());
				System.out.println("Numero de Identificacao do Tecnico: " + t4.getNmrI());
				System.out.println("Problema encontrado: " + p4.getTipo());	
				System.out.println("Obrigado por usar nossa companhia!");
				System.out.println("Por favor, avalie-nos!(nota de 1 a 5):");
				p4.setAvaliacao(entrada.nextInt());
				System.out.println("Obrigado!! ;)");	
				break;
			}
			System.out.println();
		}while(opcaoPb <= 0);
		
		
	}

}
