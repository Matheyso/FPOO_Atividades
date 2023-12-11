package Atividades_Matheus_Carvalho;

public class Cliente {
	//atributos
	public String cpf;//int publico (+)
	public String nome;//String publica (+)
	public int telefone;//int publica (+)
	public int idade;//int publica (+)
	public double altura;//float publico (+)
	public double peso;//int publica (+)
	//fim atributos
	
	//metodos (getters and setters)
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String c) {
		cpf = c;
	}
	
	public void setNome(String n) {//nome recebe n
		nome = n;//nome da pessoa (atribuiao)
	}
	
	
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int t) {
		telefone = t;
	}
	
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int i){
		idade = i;
	}
	
	public double getAltura() {
		return altura;
	}
	
	
	public void setAltura(double a) {
		altura = a;
	}
	public double getPeso() {
		return peso;
	}
	//fim metodo
	
	//metodos especiais
	
	public void CalculadoraIMC(double altura, double peso){
		double R = peso/altura*altura;
		
		if ( R <= 18.5) {
			System.out.println("magreza");
		}else if (R >= 18.5 && R <= 24.9);{
		System.out.println("normal");}
		if (R >= 25 && R <= 29.9);{
			System.out.println("sobrepeso");
		}
	}
	
	public double calcularPesoDesejado(double metaPeso) {
		if(peso > metaPeso) {
			return peso - metaPeso;
	}else
		return metaPeso - peso;
	}
	public void imprimirDados(){
		System.out.println("CPF: " + cpf + "Nome: " + nome + "Tel: " + telefone + "Idade: " + idade + "Altura: " + altura + "Peso: " + peso);
	}
	
	
	
	
	}


