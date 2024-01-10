package trabalho4;

public class Alunos {
	
	private String nome;
	private int idade;
	private String cpf;
	private int matricula;
	
	public Alunos(String nome, int idade, String cpf, int matricula) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.matricula = matricula;
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
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

}
