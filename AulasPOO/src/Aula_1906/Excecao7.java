package Aula_1906;

import java.util.Scanner;

public class Excecao7 {

	public static void main(String[] args) {
		String cpf; //123.456.789-00 valido!
		Scanner entrada = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("Digite o CPF");
				cpf = entrada.nextLine();
				if(!validarCPF(cpf)) {
					throw new IllegalArgumentException("CPF invalido!" + "Digite Novamente");
				}
				break;
			}catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	    public static boolean validarCPF(String cpf) {
	    cpf = cpf.replaceAll("\\D","");
	    if(cpf.length() != 11) {
		return false;
	    }
	    
	    if(cpf.matches("\\D\\\1{10}")) {
			return false;
	    }
	    return true;
		
     }
  }


