package trabalho5;

import java.time.LocalDate;

public class Estudante {

	private String nome;
	private int idade;
	private String cpf;
	private int matricula;
	private LocalDate dataNascimento;
	
	public Estudante() {
		super();
	}
	
	
	public Estudante(String nome, int idade, String cpf, int matricula, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.matricula = matricula;
		this.dataNascimento = dataNascimento;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
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
