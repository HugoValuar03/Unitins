package Exercícios.Questão1;

import java.util.Scanner;

public class Telefone {
	
	Long numero;
	
	public Telefone() {
		
	}

	
	public long lerTelefone() {
		
		Scanner lerNumero = new Scanner(System.in);
		
		System.out.println("Telefone com DDD: ");
		numero = lerNumero.nextLong();
		
		lerNumero.close();
		
		return numero;
	}
	
	public String conversorTexto() {
		return String.valueOf(numero);
	}
		
}
