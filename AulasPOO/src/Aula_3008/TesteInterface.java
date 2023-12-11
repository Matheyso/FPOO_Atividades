package Aula_3008;

public class TesteInterface {

	public static void main(String[] args) {
		//instancia de objetos
		//não posso instanciar objetos de interfaces, mas sim de classes!!!!!!!!!!!!!!
		InterfacePai obj = new UsoInterface();
		obj.BeberAgua();
		obj.JogarAgua();
		//System.out.println(obj.EncherGarrafa(1, 2));
		obj.EncherGarrafa(1, 2);
	}

}
