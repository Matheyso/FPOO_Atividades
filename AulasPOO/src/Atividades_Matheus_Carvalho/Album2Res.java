package Atividades_Matheus_Carvalho;

import java.util.Scanner;

public class Album2Res {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int N = entrada.nextInt();//quantidade de espaços no album
		int M = entrada.nextInt();//quantidade de figu compradas
		Boolean[] ja_tenho = new Boolean [N];//true or false
		int X = 0;//fig compradas
		//varrendo o vetor
		for(int i = 0; i < N; i++) {
		ja_tenho[i] = false;
		}
		//fig que ja temos!
		for(int i = 0; i < M;i++) {
			X = entrada.nextInt();
			ja_tenho[X]= true;
		}
		int repetidas = 0;
		//vamos marcar as repetidas!
		for(int i = 0; i < N; i++)
			if(ja_tenho[i]);
				repetidas = repetidas + 1; //ou repetidas++
		//vamos contar a quantidade de figurinhas repetidas
		System.out.println("quantidade de fig. repetidas = " + (N - repetidas));
		System.out.println("tamanho album = " + N);
		System.out.println("quantidade de figurinhas = " + M);
		

	}

}
