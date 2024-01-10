package listas_ordenacao.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListaPessoa {

	public static void main(String[] args) {
		
		List<Pessoa> lista = new ArrayList<>();
		
		lista.add(new Pessoa("Leandra", "123", 30));
		lista.add(new Pessoa("Marco", "124", 40));
		lista.add(new Pessoa("Jocivan", "125", 29));		
		lista.add(new Pessoa("Napoleão", "231", 34));
		lista.add(new Pessoa("Credson", "412", 28));
		lista.add(new Pessoa("Farlos", "414", 48));
		
		for (Pessoa valor : lista) {
			System.out.println(valor);
			System.out.println();
		}
		
		System.out.println();
		
		//Ordenação por nome
		lista.sort((p1,p2) -> p1.getNome().compareTo(p2.getNome()));
		
		//Impressão
		lista.forEach(p -> System.out.println(p));
		
		System.out.println();
		
		lista.stream()
			.filter(p -> p.getIdade() > 30)
			.sorted((p1,p2) -> {
			Integer valor = p1.getIdade();
			return valor.compareTo(p2.getIdade());
		})
		.forEach(p -> System.out.println(p));
				
	}
}
