package classeAbstrata.modelo;

public class PessoaFisica extends Pessoa{
	
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public void imprimir() { // sobreescrita - pois existe esse metodo na classe pai
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "PessoaFisica getCpf()=" + getCpf() + ", getNome()=" + getNome() + "]";
	}
	
	
}
