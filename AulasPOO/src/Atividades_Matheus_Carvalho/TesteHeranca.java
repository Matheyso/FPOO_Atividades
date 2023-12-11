package Atividades_Matheus_Carvalho;

import java.util.Scanner;

public class TesteHeranca {

	public static void main(String[] args) {
	//Scanner e System
	Scanner entrada = new Scanner(System.in);
	//instancia de objetos
	Aluno aln1 = new Aluno();
	Aluno aln2 = new Aluno();
	Professor prof1 = new Professor();
	Professor prof2 = new Professor();
	System.out.println("Informe os dados do aluno");
	System.out.println("Informe nome do aluno");
	System.out.println("Nome: ");
	String nomeAluno = entrada.nextLine();
	System.out.println("Informe o endereco do aluno: ");
	System.out.println("Endereco: ");
	String enderecoAluno = entrada.nextLine();
	System.out.println("Informe o telefone do aluno");
	System.out.println("Telefone: ");
	int telefoneAluno = entrada.nextInt();
	System.out.println("Informe o cpf do aluno");
	System.out.println("cpf");
	int cpfAluno = entrada.nextInt();
	System.out.println("Informe o celular do aluno");
	System.out.println("Celular");
	int celularAluno = entrada.nextInt();
	
	aln1.calcularMedia();
	aln1.situacaoFinal();
	
	}

}
