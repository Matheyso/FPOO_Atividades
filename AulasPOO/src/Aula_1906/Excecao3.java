package Aula_1906;

import java.util.Scanner;

public class Excecao3 {

	public static final String minha_senha = "123"; //finalvira constante
		
	public static void main (String[] args) {
		boolean senha_correta = false;
		while(senha_correta) {		
			try{
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua senha: ");
		String senha_digitada = entrada.nextLine();
		if(!senha_digitada.equals(minha_senha)) {
			throw new Exception("Senha Invalida!");
		}
		System.err.println("Senha correta...");
		senha_correta = true;
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
		}
	}
}
