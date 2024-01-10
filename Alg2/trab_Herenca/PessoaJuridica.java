package trab_Herenca;

public class PessoaJuridica extends Pessoa{

	private String cnpj = "12.345.678/0001-90";
	private String inscricaoEstadual = "02.232.3355-6";
	private String telefoneFixo = "3303-3333";
	

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
