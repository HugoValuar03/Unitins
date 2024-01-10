package trab_Herenca;

public class Pessoa {

	private Integer id = 1;
	private String nome = "Irineu";
	private String email = "irineu@teste.com";
	
	public void imprimir() {
		System.out.println("Id: " + getId());
		System.out.println("Nome: " + getNome());
		System.out.println("email: " + getEmail());
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	
}
