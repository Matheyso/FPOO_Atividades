package Atividades_Matheus_Carvalho;

public class ClienteVoo {
	private String nome;
	private String sobrenome;
	private String email;
	ClienteVoo(){
		
	}
	ClienteVoo(String nm, String sb, String eml){
		this.nome = nm;
		this.sobrenome = sb;
		this.email = eml;
	}

	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nm) {
		this.nome = nm;
	}
	public String getSobrenome(){
		return sobrenome;
	}
	public void setSobrenome(String sb) {
		this.sobrenome = sb;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String eml) {
		this.email = eml;
	}
	public void mostrarDetalhes() {
		System.out.println("O nome do cliente e: " + getNome());
		System.out.println("O sobrenome do cliente e: " + getSobrenome());
		System.out.println("O email do cliente e: " + getEmail());
	}
}
