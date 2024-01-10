package trabalho4;

public class Pessoa {

	private String nome;
	private int idade;
	private String cpf;
	private double telefone;
	
	public static void cadastrarPessoa() {
		
		Pessoa pessoa1 = new Pessoa();
		Relogio relogio1 = new Relogio();
		Relogio relogio2 = new Relogio();
		pessoa1.setNome("João");
		pessoa1.setCpf("123");
		pessoa1.setIdade(25);
		pessoa1.setTelefone(123456789);
		relogio1.setMarca("Apple");
		relogio1.setRedondo(false);
		relogio1.setValor(3000);
		relogio1.setModelo("series 7");
		relogio2.setMarca("Huawei");
		relogio2.setModelo("solar");
		relogio2.setRedondo(true);
		relogio2.setValor(380);
				
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getTelefone() {
		return telefone;
	}

	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}
	
	
	
}
