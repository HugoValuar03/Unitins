package trab_Herenca.Questao5;

import java.util.Objects;

public class Pessoa {
	
	private Integer id = 1;
	private String nome = "Irineu";
	private String email = "irineu@teste.com";
	
	public void imprimir() {
		System.out.println("Id: " + getId());
		System.out.println("Nome: " + getNome());
		System.out.println("email: " + getEmail());
		
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id, nome);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "id: " + id + "n\nome: " + nome + "\nemail: " + email;
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
