package consumer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class Principal {

	public static void main(String[] args) {
		
		
		
		Carro carro = new Carro("Celta", "GM");
		carro.setPlaca("XYD-4412");
		
		Carro carro2 = new Carro("Fiesta", "Ford");
		carro.setPlaca("XYD-4433");
		
		Map<String, Carro> mapa = new HashMap<String, Carro>();
		
		mapa.put(carro.getPlaca(), carro);
		mapa.put(carro2.getPlaca(), carro2);
		
		Carro carro3 = new Carro("Onix", "GM");
		carro3.setPlaca("XYD-4412");
		
		mapa.put(carro3.getPlaca(), carro3);
		
		System.out.println(mapa);
		
		System.out.println("----------------------------");
		
		
		List<Carro> lista = new ArrayList<Carro>();
		
		lista.add(new Carro("Argo", "Fiat"));
		lista.add(new Carro("Celta", "GM"));
		lista.add(new Carro("Fiat", "Ford"));
		lista.add(new Carro("Bronco", "Ford"));
		
		lista.forEach(new Consumer<Carro>(){

			@Override
			public void accept(Carro c) {
				System.out.println(c);
			}
			
		});
		
		System.out.println();
		System.out.println("Em lambda");
		System.out.println();
		
		lista.forEach(c -> {
			System.out.println(c);
		});
		
		System.out.println();
		System.out.println("Filtrando somente os Ford");
		System.out.println();
		
		lista.stream()
			.filter(c -> c.getMarca().equals("Ford"))
			.forEachOrdered(c -> System.out.println(c));
		
		System.out.println();
		System.out.println("Filtrando em ordem alfabética");
		System.out.println();
		
		Collections.sort(lista);
		
		lista.stream()
		.filter(c -> c.getMarca().equals("Ford"))
		.forEachOrdered(c -> System.out.println(c));
		
		System.out.println();
		System.out.println("Filtrando em ordem alfabética com Lambda por marca");
		System.out.println();
		
//		Comparator<Carro> comparator = (c1, c2) -> c1.getNome().compareTo(c2.getNome());
		
		lista.stream()
//		.filter(c -> c.getMarca().equals("Ford"))
		.sorted(Carro.comparatorMarca())
		.forEachOrdered(c -> System.out.println(c));
		
	}
	
	
	
}
