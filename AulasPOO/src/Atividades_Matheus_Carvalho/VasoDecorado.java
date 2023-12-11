package Atividades_Matheus_Carvalho;

public class VasoDecorado{
	//Atributos
	private String decoracao;
	//metodo construtor
	VasoDecorado(){
		
	}
	VasoDecorado(String decoracao){
		this.decoracao = decoracao;
	}
	//metodos getters and setters
	public String getDecoracao() {
		return decoracao;
	}
	public void setDecoracao(String decoracao) {
		this.decoracao = decoracao;
	}
	//exibindo informacoes
	
	public void exibirInfo() {
		System.out.println("Decoracao do Vaso: " + decoracao);
	}
}
