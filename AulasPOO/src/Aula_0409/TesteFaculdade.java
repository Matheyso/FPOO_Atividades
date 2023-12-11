package Aula_0409;

import java.util.List;
import java.util.ArrayList;

public class TesteFaculdade {

	public static void main(String[] args) {
		Estudante e1 = new Estudante("Joao", 10, "TIA");
		Estudante e2 = new Estudante("Maria ", 20, "TIB");
		Estudante e3 = new Estudante("Pedro", 100, "ECP");
		Estudante e4 = new Estudante("Ana", 200, "ECP");
		//criando lista vazia de estudantes
		List<Estudante> eTI = new ArrayList();
		//adicionar alunos criados na lista
		eTI.add(e1);
		eTI.add(e2);
		//eTI.add(e3);
		//eTI.add(e4);
		//mostrando os alunos que estao na lista
		int i2 = 0;
		for(Estudante estudante : eTI) {
			System.out.printf("Posicao %d-%s %d %s", i2, estudante.nome, estudante.ra, estudante.curso);
			i2++;
		}
		//vamos adicionar os alunos e3 e e4 na lista
		
		List<Estudante> eEE = new ArrayList<Estudante>();//lista eEE
		eEE.add(e3);
		eEE.add(e4);
		//instancia da classe Turma
		Turma TIA = new Turma("TI", eTI);
		Turma EE = new Turma("EngE", eEE);
		//agora criei uma lista de turma para adicionar os alunos a ela
		List<Turma> tur = new ArrayList<Turma>();
		tur.add(TIA);
		tur.add(EE);
		//ler a lista e verificar quais alunos estao nela
		for(int i = 0; i < tur.size(); i++) {
			System.out.println(" Nome das turmas: " + tur.get(i).getNome());
		}
		//instancia da classe faculdade
		Faculdade senai = new Faculdade("SENAI", tur);
		System.out.println("Total de estudantes da faculdade e: " );
		System.out.println(senai.getTotalEstudantes());
		

	}

}
