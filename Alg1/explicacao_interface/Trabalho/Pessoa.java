package explicacao_interface.Trabalho;

import java.util.Objects;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private Sexo sexo;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Sexo getSexo() {
		return sexo;
	}
	
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome, sexo);
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
		return Objects.equals(cpf, other.cpf) && Objects.equals(nome, other.nome) && sexo == other.sexo;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\nCpf: " + cpf + "\nSexo:" + sexo;
	}
	
	public Pessoa(String nome, String cpf, Sexo sexo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
	}
	
	public Pessoa() {
		
	}
}
