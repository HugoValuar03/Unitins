package trab_Herenca.Questao5;

import java.util.Objects;

public class PessoaJuridica extends Pessoa{

	private String cnpj = "12.345.678/0001-90";
	private String inscricaoEstadual = "02.232.3355-6";
	private String telefoneFixo = "3303-3333";
	
	
	@Override
	public int hashCode() {
		return Objects.hash(cnpj, inscricaoEstadual, telefoneFixo);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaJuridica other = (PessoaJuridica) obj;
		return Objects.equals(cnpj, other.cnpj) && Objects.equals(inscricaoEstadual, other.inscricaoEstadual)
				&& Objects.equals(telefoneFixo, other.telefoneFixo);
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println(getCnpj());
		System.out.println(getInscricaoEstadual());
		System.out.println(getTelefoneFixo());
	}

	@Override
	public String toString() {
		super.imprimir();
		return "cnpj: " + cnpj + "\ninscricaoEstadual: " + inscricaoEstadual + "\ntelefoneFixo: " + telefoneFixo;
	}	
	
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	public String getTelefoneFixo() {
		return telefoneFixo;
	}
	
	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}
}
