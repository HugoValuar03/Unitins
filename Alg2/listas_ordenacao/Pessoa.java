package listas_ordenacao;

import java.util.Comparator;
import java.util.List;

public class Pessoa implements Comparable<Pessoa> {


	private String nome;
	private String cpf;
	private int idade;
	
	@Override
	public String toString() {
		return "nome: " + nome + "\nCpf: " + cpf + "\nIdade: " + idade;
	}
	
	public Pessoa(String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	public static void ordernarPorNome(List<Pessoa> lista) {
		lista.sort(new Comparator<Pessoa>(){
			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.getNome().compareTo(o2.getNome());
			}
		});
	}
	
	public static void ordernarPorCpf(List<Pessoa> lista) {
		lista.sort(new Comparator<Pessoa>(){
			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.getCpf().compareTo(o2.getCpf());
			}
		});
	}
	
	public static void ordernarPorIdade(List<Pessoa> lista) {
		lista.sort(new Comparator<Pessoa>(){
			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				Integer valor = o1.getIdade();
				return valor.compareTo(o2.getIdade());
			}
		});
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int compareTo(Pessoa o) {
		return this.nome.toLowerCase().compareTo(o.getNome().toLowerCase()); 
		//Usando a implentação pronta da classe String para retornar 1, 0, ou -1
	}
	
}
