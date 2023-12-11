package Atividades_Matheus_Carvalho;

import java.util.Scanner;

public class Contas3W {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe valor disponível: ");
        int Vojoao = entrada.nextInt();
        
        System.out.println("Informe gastos na Padaria: ");
        int Padaria = entrada.nextInt();
        
        System.out.println("Informe gastos na Farmácia: ");
        int Farmacia = entrada.nextInt();
        
        System.out.println("Informe gastos no Açougue: ");
        int Acougue = entrada.nextInt();
        
        // Utilizando vetor
        int resp = 0;
        int[] contas = { Acougue, Farmacia, Padaria };

        if (contas[0] + contas[1] + contas[2] <= Vojoao) {
            resp = 3;
        } else if (contas[0] + contas[1] <= Vojoao) {
            resp = 2;
        } else if (contas[0] <= Vojoao) {
            resp = 1;
        } else {
            resp = 0;
        }
        
        System.out.printf("%d\n", resp);
    }
}
