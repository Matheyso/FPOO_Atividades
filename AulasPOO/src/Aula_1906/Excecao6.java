package Aula_1906;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Excecao6 {

	public static void main(String[] args) {
		try {
		File arquivo = new File("C:\\Users\\Instrutor\\Desktop");
		Scanner entrada = new Scanner(arquivo, "UTF-8");
		while(entrada.hasNextLine()) {
			String linha = entrada.nextLine();
			System.out.println("texto do arquivo: " + linha);
		}
		entrada.close();
	}catch(FileNotFoundException e) {
		System.out.println("O arquivo nao foi encontrado!");
	}
		System.out.println("O programa foi encerrado!");
}
}