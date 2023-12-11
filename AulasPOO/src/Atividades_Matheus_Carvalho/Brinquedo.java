package Atividades_Matheus_Carvalho;

public class Brinquedo {
	private String nome;//caractere privado
	private double alturaMinima;//numero com ponto ou virgula privado
	private int capacidadeMaxima;//numero privado
	//fim dos atributos
	
	//construtor padrão (Default)
	Brinquedo(String nm, double altmin, int capmax){
		this.nome = nm;
		this.alturaMinima = altmin;
		this.capacidadeMaxima = capmax;
	}
	
	//metodos (getters e setters)
	//start get and set nome
		public String getNome() {
			return nome;
		}
		public void setNome(String n) {//nome recebe n
			this.nome = n;//nome do brinquedo (atribuição)
		}
	//end get and set name
	//start get and set alturaMinima
		public double getAlturaMinima() {
			return alturaMinima;
		}
		public void setAlturaMinima(Double am) {//alturaMinima recebe am
			this.alturaMinima = am;//altura minima (atribuição)
		}
	//end get and set alturaMinima
	//start get and set capacidadeMaxima
		public int getCapacidadeMaxima() {
			return capacidadeMaxima;
		}
		public void setCapacidadeMaxima(int cm) {//capacidadeMaxima recebe cm
			this.capacidadeMaxima = cm;//capacidade maxima do brinquedo (atribuição)
	//end get and set capacidadeMaxima
		}
		
		public void exibirInfo() {
			System.out.println("O nome do brinquedo é: " + nome);
			System.out.println("a altura minima é: "  + alturaMinima);
			System.out.println("a capacidade maxima é: " + capacidadeMaxima);
		}
		
}
