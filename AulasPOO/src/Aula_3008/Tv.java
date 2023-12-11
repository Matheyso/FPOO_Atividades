package Aula_3008;

public class Tv implements ControleRemoto {

	@Override
	public void desligar() {
		System.out.println("A tv esta desligada... ");
	}
	@Override
	public void ligar() {
		System.out.println("A tv ligou !!!!!!!!!!!");
	}
	@Override
	public void volumeMais(int volma) {
		volma = volma + 1;
		System.out.println("Aumentando... o volume atual e: " + volma);
	}

	@Override
	public void volumeMenos(int volme) {
		volme = volme - 1;
		System.out.println("Diminuindo... o volume atual e: " + volme);
	}

	@Override
	public int getPolegadas() {
	
		return 80;
	}
	
}
