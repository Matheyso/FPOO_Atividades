package Aula_2108;

import br.org.sesisp.java.matheus.ClasseExterna;

public class TesteVisibilidade {

	public static void main(String[] args) {
		//instancia de objetos
		SubClasse1 sub1 = new SubClasse1();
		System.out.println("senha vista pela SubClasse1 " + sub1.getSenha());

		SubClasse1 sub2 = new SubClasse1();
		System.out.println("senha vista pela SubClasse1 " + sub2.getSenha());
		//obj da ClasseExterna
		ClasseExterna cx = new ClasseExterna();
		System.out.println("Senha viata pela ClasseExterna " + cx.getSenha());
		//instanciando uma classe abstrata
		//NAAAAAAAAAAAO PODEMOS!!!!
		//ClassePai cp = new ClassePai();
			//cp.nome = "sei la";*/
		
		
	}

}
