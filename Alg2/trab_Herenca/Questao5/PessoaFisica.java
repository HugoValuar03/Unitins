package trab_Herenca.Questao5;

import java.util.Objects;

public class PessoaFisica extends Pessoa {

	private String cpf = "123.456.789-12";
	private String celular = "(63) 98446-0441";
	
	public PessoaFisica() {
		super();
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println(getCpf());
		System.out.println(getCelular());
	}

	@Override
	public int hashCode() {
		return Objects.hash(celular, cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaFisica other = (PessoaFisica) obj;
		return Objects.equals(celular, other.celular) && Objects.equals(cpf, other.cpf);
	}

	@Override
	public String toString() {
		super.imprimir();
		return "cpf: " + cpf + "\ncelular: " + celular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
}
