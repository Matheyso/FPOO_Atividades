package Aula_0409;

public class TesteEmpresa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Gerente", "Marcelo", 45);
		Empregado1  emp1 = new Empregado1();
		Empregado1 emp2 = new Empregado1(15000, p1);//empregado é um tipo de pessoa
		System.out.println("Cargo: " + p1.cargo);
		System.out.println("Salario: " + emp2.getSalario());

	}

}
