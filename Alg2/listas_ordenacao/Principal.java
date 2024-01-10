package listas_ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		
		lista.add(4);
		lista.add(2);
		lista.add(141423);		
		lista.add(321323);
		lista.add(23123);
		lista.add(41512412);
		
		for (Integer valor : lista) {
			System.out.println(valor);
		}
		System.out.println();
		
		//ordenado
		Collections.sort(lista);
		for (Integer valor : lista) {
			System.out.println(valor);
		}
 	}
}
