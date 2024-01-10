package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
	private String nome;
	private LocalDate dataNascimento;
	
	public Pessoa() {
		
	}
	
	
	public Pessoa(String nome, String dataNascimento) {
		setNome(nome);
		setDataNascimento(dataNascimento);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
	public void setDataNascimento(int dia, int mes, int ano) {
		this.dataNascimento = LocalDate.of(ano, mes, dia);
	}
	
	public void setDataNascimento(String data) {
		this.dataNascimento = LocalDate.parse(data,
				DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
	
	public int getDiaDataNascimento() {
		return this.dataNascimento.getDayOfMonth();
	}
}
