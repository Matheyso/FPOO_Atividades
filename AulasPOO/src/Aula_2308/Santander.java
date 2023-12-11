package Aula_2308;

public class Santander extends CaixaEletronico {//BANCO Santander
	//metodos
	@Override//sobrescrita de metodo
	public void sacar(double valor) {
		valor = valor + 1.5;//taxa cobrada pela transação
		System.out.println("O seu saque no Santander foi = " + valor);
}
}