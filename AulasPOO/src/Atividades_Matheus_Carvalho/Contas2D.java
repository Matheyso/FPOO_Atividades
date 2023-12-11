package Atividades_Matheus_Carvalho;

import java.util.Scanner;

public class Contas2D {

    public static void main(String[] args) {
        int Vojoao, Padaria, Farmacia, Acougue;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe valor disponível: ");
        Vojoao = entrada.nextInt();

        System.out.println("Informe gastos na Padaria: ");
        Padaria = entrada.nextInt();

        System.out.println("Informe gastos na Farmácia: ");
        Farmacia = entrada.nextInt();

        System.out.println("Informe gastos no Açougue: ");
        Acougue = entrada.nextInt();

        if (Vojoao >= (Padaria + Farmacia + Acougue)) {
            System.out.println("3");
        } else if (Vojoao >= (Padaria + Farmacia) || Vojoao >= (Padaria + Acougue)) {
            System.out.println("2");
        } else if (Vojoao >= Acougue || Vojoao >= Farmacia || Vojoao >= Padaria) {
            System.out.println("1");
        }
    }

	}



