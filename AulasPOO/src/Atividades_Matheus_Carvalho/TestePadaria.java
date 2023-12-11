package Atividades_Matheus_Carvalho;

import java.util.Scanner;

public class TestePadaria {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ProdutoPadaria pao1 = new Pao("Pao Frances", 2);
		ProdutoPadaria pao2 = new Pao("Pao Sovado", 3);
		ProdutoPadaria bolo1 = new Doce("Fuba", 4);
		ProdutoPadaria bolo2 = new Doce("Milho", 2);
		ProdutoPadaria doce1 = new Bolo("Quindim", 4);
		ProdutoPadaria doce2 = new Bolo("Pacoca", 2);
		PessoaComer pss1 = new PessoaComer();
		
		System.out.println("Informe seu pedido");
		System.out.println("Pao: ");
		pao1.setNome(entrada.next());
		System.out.println("informe o preco: ");
		pao1.setPreco(entrada.nextDouble());
		
		System.out.println("Bolo: ");
		bolo1.setNome(entrada.next());
		
		System.out.println("informe o preco: ");
		bolo1.setPreco(entrada.nextDouble());
		
		System.out.println("Doce: ");
		doce1.setNome(entrada.next());
		System.out.println("Informe o preco: ");
		doce1.setPreco(entrada.nextDouble());
		
		pao1.exibirInfoPao();
		bolo1.exibirInfoBolo();
		doce1.exibirInfoDoce();
		
		double total = (pao1.preco + bolo1.preco + doce1.preco);
		System.out.println("O total a se pagar e: " + total);
		
		System.out.println("A pessoa comeu " + pao1.getNome() + ", " + bolo1.getNome() + " e " + doce1.getNome());
	}

}
