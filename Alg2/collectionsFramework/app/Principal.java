package collectionsFramework.app;

import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		Map<String, String> mapa = new HashMap<>();
		
		mapa.put("111", "Leandra");
		mapa.put("222", "Marco");
		mapa.put("333", "Silvano");
		mapa.put("444", "Alex");
		mapa.put("333", "Douglas");
		
		// Exibe os valores ordenados conforme foi cadastrado e substitui se houver algum valor repetido
		System.out.println(mapa); 
		
		// Exibe apenas a chave
		System.out.println(mapa.keySet());
		
		// Exibe apenas os valores
		System.out.println(mapa.values());
	}
}