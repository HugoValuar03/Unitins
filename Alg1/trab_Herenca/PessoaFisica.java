package trab_Herenca;

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
