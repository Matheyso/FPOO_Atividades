package Atividades_Matheus_Carvalho;

import java.util.Scanner;

public class TesteBike {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	//instanciado objetos bike
	MountainBike Mbike1 = new MountainBike();
	MountainBike Mbike2 = new MountainBike();
	SpeedBike Sbike1 = new SpeedBike();
	SpeedBike Sbike2 = new SpeedBike();
	PessoaBike pes1 = new PessoaBike();
	PessoaBike pes2 = new PessoaBike();
	
	System.out.println("Informe seu nome: ");
	pes1.setNome(entrada.nextLine());
	System.out.println("Informe os dados da MountainBike: ");
	System.out.println("Informe a marcha atual da MountainBike");
	Mbike1.setMarcha(entrada.nextInt());
	System.out.println("Informe a velocidade atual da MountainBike");
	Mbike1.setVelocidade(entrada.nextInt());
	
	System.out.println("A pessoa " + pes1.getNome() + " subiu na MountainBike ");
	
	Mbike1.aumentarMarcha(Mbike1.getMarcha());
	Mbike1.diminuirMarcha(Mbike1.getMarcha());
	Mbike1.acelerar(Mbike1.getVelocidade());
	Mbike1.frear(Mbike1.getVelocidade());
	
	System.out.println("Informe seu nome: ");
	pes2.setNome(entrada.next());
	System.out.println("Informe os dados da SpeedBike: ");
	System.out.println("Informe a marcha atual da SpeedBike");
	Sbike1.setMarcha(entrada.nextInt());
	System.out.println("Informe a velocidade atual da SpeedBike");
	Sbike1.setVelocidade(entrada.nextInt());
	
	Sbike1.aumentarMarcha(Sbike1.getMarcha());
	Sbike1.diminuirMarcha(Sbike1.getMarcha());
	Sbike1.acelerar(Sbike1.getVelocidade());
	Sbike1.frear(Sbike1.getVelocidade());
	
	
	
	
	
	
	

	}

}
