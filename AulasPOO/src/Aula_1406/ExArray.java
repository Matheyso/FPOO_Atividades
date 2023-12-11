package Aula_1406;

import java.util.Scanner;

public class ExArray {

    public static void main(String[] args) {
        // instanciar ("criar") o vetor de notas sem os valores
        int[] notas = new int[2];
        int soma = 0;
        
        // instanciar ("criar") um objeto para pegar os valores digitados
        Scanner entrada = new Scanner(System.in);

        // receber as duas notas que estão vindo do objeto de entrada
        for (int i = 0; i < 2; i++) {
            System.out.print("\nEntre com o Número " + (i + 1) + ": ");
            notas[i] = entrada.nextInt();
        }

        // exibir (leia [usar for]) os valores que estão no vetor
        for (int i = 0; i < 2; i++) {
            System.out.printf("Número %d --> Nota armazenada: %d\n", (i + 1), notas[i]);
            soma += notas[i];
        }

        // exibir a média simples
        int media = soma / 2;
        System.out.println("A média das notas é: " + media);
    }
}
