package explicacao_interface;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
			
		List<String> lista = new ArrayList<>();
		
		lista.add("Leandra"); //Adiciona algo na lista
		lista.add("blah"); //Adiciona algo na lista
		
		for (Object obj : lista) {
			System.out.println(obj);
		}
		
		lista.set(0, "Leandro");
		
		System.out.println("");
		for (Object obj : lista) {
			System.out.println(obj);
		}
		System.out.println("");
		System.out.println(lista.size()); //Mostra o tamanho da lista
		System.out.println(lista.isEmpty()); //Mostra se a lista está vazia
		
		
		System.out.println(lista.contains("Leandro"));
	}
	
	public static void imprimir(List<String> lista) {
		
	}
}
