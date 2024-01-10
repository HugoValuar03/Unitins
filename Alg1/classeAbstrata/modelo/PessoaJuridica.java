package classeAbstrata.modelo;

public class PessoaJuridica extends Pessoa{
	
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public void imprimir() { // sobreescrita - pois existe esse metodo na classe pai
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "PessoaJuridica [getCnpj()=" + getCnpj() + ", getNome()=" + getNome() + "]";
	}
	
	
}
