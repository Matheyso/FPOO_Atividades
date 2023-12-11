package Atividades_Matheus_Carvalho;

public class SpeedBike implements Veiculo{
	//atributos
	public int velocidade;
	public int marcha;
	//met construtor
	SpeedBike(){
		
	}
	SpeedBike(int vel, int mar){
		this.velocidade = vel;
		this.marcha = mar;
	}
	//get e set
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getMarcha() {
		return marcha;
	}
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	//met especial
	public void estadoSpeedBike() {
		boolean andando;
		if(andando = true) {
			System.out.println("A SpeedBike esta andando!!");
		}else {
			System.out.println("A SpeedBike esta parada");
		}
	}
	//metodos da interface Veiculo
	@Override
	public String aumentarMarcha(int mudMar) {
		mudMar = mudMar + 1;
		System.out.println("Aumentando a marcha... a marcha atual e: " + mudMar);
		return null;
	}
	@Override
	public String diminuirMarcha(int mudMar) {
		mudMar = mudMar - 1;
		System.out.println("Diminuindo a marcha... a marcha atual e: " + mudMar);
		return null;
	}
	@Override
	public void acelerar(int aclr) {
		aclr = aclr + 1;
		System.out.println("Acelerando... a velocidade atual e: " + aclr + "km/h");
	}
	@Override
	public void frear(int dimi) {
		dimi = dimi - 1;
		System.out.println("Freando... a velocidade atual e: " + dimi + "km/h");
	}
	
	}
