package listas_ordenacao;

import java.util.ArrayList;
import java.util.List;

public class ListaPessoa {

	public static void main(String[] args) {
		
		List<Pessoa> lista = new ArrayList<>();
		
		System.out.println("-------------");
		System.out.println("Lista Normal");
		System.out.println("-------------");
		lista.add(new Pessoa("Leandra", "123", 30));
		lista.add(new Pessoa("Marco", "124", 40));
		lista.add(new Pessoa("Jocivan", "125", 32));		
		lista.add(new Pessoa("Napoleão", "231", 34));
		lista.add(new Pessoa("Credson", "412", 31));
		lista.add(new Pessoa("Farlos", "414", 48));
		
		for (Pessoa valor : lista) {
			System.out.println(valor);
			System.out.println();
		}
		System.out.println("-------------------");
		System.out.println("Ordenando por CPF");
		System.out.println("-------------------");
		
		Pessoa.ordernarPorCpf(lista);
		
		for (Pessoa valor : lista) {
			System.out.println(valor);
			System.out.println();
		}
		
		System.out.println("--------------------");
		System.out.println("Ordenando por Nome");
		System.out.println("--------------------");
		
		Pessoa.ordernarPorNome(lista);
		
		for (Pessoa valor : lista) {
			System.out.println(valor);
			System.out.println();
		}
		
		System.out.println("--------------------");
		System.out.println("Ordenando por Idade");
		System.out.println("--------------------");
		
		Pessoa.ordernarPorIdade(lista);
		
		for (Pessoa valor : lista) {
			System.out.println(valor);
			System.out.println();
		}
	}
}
