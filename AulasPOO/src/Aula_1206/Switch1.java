package Aula_1206;

public class Switch1 {

	public static void main(String[] args) {
		int idade = 18;
		switch (idade) {
		case (10):
			System.out.println("Menor de Idade!");
			break;
		case (18):
			System.out.println("Maior de Idade!");
			break;
		case (70):
			System.out.println("Veia pra caralho!");
			break;
		default:
			System.out.println("Nenhuma Idade Valida!");
			break;
		}

	}

}
