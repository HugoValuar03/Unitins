package herança.aplicacao;

import herança.modelo.Quadrado;
import herança.modelo.Retangulo;

public class Principal {
	
	public static void main(String[] args) {
		
		Retangulo retangulo = new Retangulo(10,15);
		
		
		
		Quadrado quadrado = new Quadrado(20);
		
		quadrado.imprimir();
		retangulo.imprimir();
		
	}
//		System.out.println(quadrado.getAltura());
//		System.out.println(quadrado.getLargura());
//		System.out.println(retangulo.getAltura());
//		System.out.println(retangulo.getLargura());
	
}
