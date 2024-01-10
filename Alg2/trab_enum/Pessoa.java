package trab_enum;

import java.time.LocalDate;

public class Pessoa {

	private String nome;
	private LocalDate dataNascimento;
	private StatusRelacionamento relacionamento;
	
	public Pessoa(String nome, LocalDate dataNascimento, StatusRelacionamento relacionamento) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.relacionamento = relacionamento;
	}
	
	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public StatusRelacionamento getRelacionamento() {
		return relacionamento;
	}

	public void setRelacionamento(StatusRelacionamento relacionamento) {
		this.relacionamento = relacionamento;
	}

}