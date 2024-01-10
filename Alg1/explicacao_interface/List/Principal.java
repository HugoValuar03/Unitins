package explicacao_interface.List;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<Carro> lista = new ArrayList<>();
		
		lista.add(new Carro("Argo", "Fiat"));
		lista.add(new Carro("Gol", "VW"));
		lista.add(new Carro("Ka", "Ford"));
		lista.add(new Carro("Ferrari", "Fiat"));

		
		int indice = lista.indexOf(new Carro("Ka", "Ford"));
		
		Carro carro = lista.get(indice);
		carro.setModelo("New Fiesta");
		
		lista.set(indice, carro);
		
		for (Carro car : lista) {
			System.out.println(car);
		}
		
		System.out.println(lista.contains(new Carro("Gol", "VW")));
	}
	
	public static boolean contains2(List<Object> lista, Object valor) {
		for(Object obj : lista) {
			if(obj.equals(valor))
				return true;
		}
		return false;
	}
}
