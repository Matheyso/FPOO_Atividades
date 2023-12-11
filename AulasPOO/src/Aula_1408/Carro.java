package Aula_1408;

class Carro {
	//atributos
	public String modelo;//caractere | publico (+)
	public float potencia;//numero com virgula ou ponto | privado (-)
	public boolean parado;//estado publico | (+)
	//fim atributos
	
	//construtor padrão (default)
	Carro(){
		System.out.println("Acabei de nascer !");
	}
	Carro(String mod, float pot){
		this.modelo = mod;
		this.potencia = pot;
	}
	//metodos (getters e setters)
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String m) {//modelo recebe m
		this.modelo = m;//nome do modelo do carro (atribuição)
	}
	public float getPotencia() {
		return potencia;
	}
	public void setPotencia(float p) {
		potencia = p;
	}//fim metodo 
	
	
	//metodos especiais (dá trabalho)
	public boolean getAcelerar() {//boolean só aceita valores true ou false
		if(parado == true) {//se esta parado... faça
			System.out.println("Sem moviento!");//
		}else {//senao esta parado:
			System.out.println("Andando");
		}
		return parado;//retornar valor verdadeiro (true)
	}
	
	public boolean getFrear() {
		if(parado == true) {
			System.out.println("Sem movimento... acionei o freio");
		}else {
			System.out.println("esta em movimento...socorro!");
		}
		return parado;
	}
	public boolean isParado() {//testa o estado em que o veículo se encontra
		return parado;	
	}
	public void setParado(boolean pa) {//muda o estado do carro
		this.parado = pa;
	}

}