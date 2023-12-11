package Sistemas_de_Chamadas_TI_Matheus_Carvalho;

public class Problema {
	//atributos
	private String tipo;
	private boolean urgencia;
	private int avaliacao;
	Problema() {
		
	}
	Problema(String tp, boolean urg) {
		this.tipo = tp;
		this.urgencia = urg;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean getUrgencia() {
		return urgencia;
	}
	public void setUrgencia(boolean urg) {
		this.urgencia = urg;
	}
	public int getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(int ava) {
		this.avaliacao = ava;
	}

}
