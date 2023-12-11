package Atividades_Matheus_Carvalho;

	import java.util.Scanner;

	public class Q1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int soma = 0;
	        
	        System.out.println("Digite uma sequencia de numeros positivos (Digite um numero negativo ou zero para parar):");
	        
	        while (true) {
	            int numero = scanner.nextInt();
	            
	            if (numero <= 0) {
	                break;
	            }
	            
	            soma += numero;
	        }
	        
	        System.out.println("A soma dos números positivos digitados é: " + soma);
	    }
	}