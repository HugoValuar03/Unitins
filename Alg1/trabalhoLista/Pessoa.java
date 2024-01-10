package trabalhoLista;

public class Pessoa implements Impressao{

	
	private String nome;
	private int idade;
	private Sexo sexo;
	
	Telefone telefone = new Telefone();
	
	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	

	@Override
	public String toString() {
		return "Nome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo +
				"\nTelefone: " + telefone;
	}

	@Override
	public void imprimir() {
		System.out.print("Nome: " + getNome() + "\nIdade: " + getIdade() + 
				"\nSexo: " + getSexo() + "\nTelefone: ");
	}
	
	public Pessoa(String nome, int idade, Sexo sexo, Telefone telefone) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.telefone = telefone;
	}

	public Pessoa() {
		
	}	
	
}
