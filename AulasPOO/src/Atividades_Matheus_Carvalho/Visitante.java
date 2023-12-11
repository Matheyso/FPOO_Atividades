package Atividades_Matheus_Carvalho;

public class Visitante {
	private String nome;//caractere privado
	private int idade;//numero privado
	private double altura;//numero com ponto ou virgula privado
	//fim dos atributos
	
	//construtor padrão (Default)
	Visitante(String nm, int idd, double alt){
		this.nome = nm;
		this.idade = idd;
		this.altura = alt;
	}
	
	
	public boolean podeAndarNoBrinquedo() {
		if( idade <= 10 && altura <= 1.50 ) {
			System.out.println("Pode andar no brinquedo");
		return true;
		}else {
			System.out.println("Nao pode andar no brinquedo");
		}
		return false;
	}
	
	//metodos (getters e setters)
	//start get and set nome
		public String getNome() {
			return nome;
		}
		public void setNome(String n) {
			this.nome = n;
		}
	//end get and set name
	//start get and set idade
		public int getIdade() {
			return idade;
		}
		public void setNome(int n) {
			this.idade = n;
		}
	//end get and set idade
	//start get and set altura
		public double getAltura() {
			return altura;
		}
		public void setNome(double a) {
			this.altura = a;
		}
	//end get and set altura
		public void exibirInfo() {
			System.out.println("Visitante: " + nome);
			System.out.println("Idade: " + idade + " anos");
			System.out.println("Altura: " + altura + " m");
		}
		
}
