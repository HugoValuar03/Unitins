package TabelaVerdade;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		TabelaVerdade tabela = new TabelaVerdade();
		Scanner calculo = new Scanner(System.in);
	    	
	    	tabela.definirValorP();
	    	boolean p = tabela.autenticarValor(calculo);
	    	
	    	System.out.println();
	    	
	    	tabela.definirValorQ();
	    	boolean q = tabela.autenticarValor(calculo);
	    	
	    	System.out.println();

	    	tabela.painelCalculo();
	    	int opcao =  calculo.nextInt();
	    	
	    	switch(opcao) {
	    	
	    	case 1: 
	    		System.out.println(p && q);
	    		break; 
	    	case 2:
	    		System.out.println(p || q);
	    		break;
	    	case 3:
	    		System.out.println(!p || q);
	    		break;
	    	case 4:
	    		System.out.println((!p || q) && (!q || p));
	    		
	    		
	    		/*
	    		 * p -> q = ~p v q
	    		 * p <-> q = (p -> q) ^ (q -> p)
	    		 * p <-> q = (!p || q) && (!q || p) 
	    		 */ 
	    	}
	    	
		}
}
