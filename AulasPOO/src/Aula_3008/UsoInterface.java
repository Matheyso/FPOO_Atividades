package Aula_3008;

public class UsoInterface implements InterfacePai {
	//atributos
	public String at1;
	//Sobrescrita de métodos!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	@Override
	public void BeberAgua() {
		System.out.println("Bebendo agua...");
	}

	@Override
	public void JogarAgua() {
		System.out.println("Nao quero mais agua.. jogando fora");
	}

	@Override
	public void EncherGarrafa(int x, int y) {
		int R = x + y;
		System.out.println("Enchendo a garrafa (: " + R);
	}
	//este método é da propria classe e não foi "herdado" de nenhuma interface ou classe
	public void MexerGarrafa() {
		System.out.println("Chacoalhando a garrafa de agua.. ;P");
	}

}
