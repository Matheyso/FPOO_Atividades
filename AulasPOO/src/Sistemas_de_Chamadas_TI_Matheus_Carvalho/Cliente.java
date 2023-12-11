package Sistemas_de_Chamadas_TI_Matheus_Carvalho;

public class Cliente {

	//atributos
	private String nome;
	private String sobrenome;
	private String endereco;
	private String email;
	//met const
	Cliente() {
		
	}
	Cliente(String nm, String sobnm, String end, String em) {
		this.nome = nm;
		this.sobrenome = sobnm;
		this.endereco = end;
		this.email = em;
	}
	//get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nm) {
		this.nome = nm;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobnm) {
		this.sobrenome = sobnm;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String end) {
		this.endereco = end;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String em) {
		this.email = em;
	}
	//met esp
	public void abrirChamado() {
		
	}

}
