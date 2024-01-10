package TabelaVerdade;

import java.util.Scanner;

public class TabelaVerdade {
	
	public void definirValorP(){
		System.out.println("Digite o valor de p: ('V' ou 'F')");
	}
	
	public void definirValorQ(){
		System.out.println("Digite o valor de q: ('V' ou 'F')");
	}
    
    public void painelCalculo() {
    	System.out.println("Digite o tipo de Calculo:");
    	System.out.println("1. p ^ q");
    	System.out.println("2. p v q");
    	System.out.println("3. p -> q");
    	System.out.println("4. p <-> q");
    }
    
    public boolean autenticarValor(Scanner variavel) {
    	String valor = variavel.next().toUpperCase();	
    	
    	if(valor.equals("V")) {
    		return true;
    	} else if(valor.equals("F")) {
    		return false;
    	} else {
    		System.out.println("Entrada inválida");
    		return false;
    	}
    }
}
