package Atividades_Matheus_Carvalho;

import java.util.Scanner;

public class Aluno extends Pessoa {
	//atributos
	private String curso;
	private float nota1;
	private float nota2;
	public float media;
	//metodo construtor padrao
	Aluno(){
		
	}
	//metodo construtor com parâmetros
	Aluno(String cur, float nota1, float nota2){
		this.curso = cur;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {//nome do curso recebe curso
		this.curso = curso;//atribuição
	}
	public float getNota1() {
		return nota1;
	}
	public void setNota1(int nota1) {//nota do aluno
		this.nota1 = nota1;//atribuição
	}
	public float getNota2() {
		return nota2;
	}
	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	
	//metodos especiais
	public void calcularMedia(){
	Scanner entrada = new Scanner(System.in);
	System.out.println("Informe a 1° nota: ");
	float nota1 = entrada.nextFloat();
	System.out.println("Informe a 2° nota: ");
	float nota2 = entrada.nextFloat();
	float media = ((nota1 + nota2)/ 2);
	System.out.println("A media e: " + media);
	}
	public void situacaoFinal(){
		if(media <=7) {	//para a utilização do float utilize uma virgula (exemplo: 7,5). Para a utilização do double utilize um ponto (ex: 7.5)
		System.out.println("Passou de Ano!");
	}else{
		System.out.println("Nao passou!");
	}
	}
}
