package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Informe o dia, mes e ano");
		int dia = scan.nextInt();
		int mes = scan.nextInt();
		int ano = scan.nextInt();
		
		System.out.println(dia + " " + mes + " " + ano);
					
	}
	
	public static Integer obterValor(String informacao) {
		System.out.println(informacao);
		int tentativas = 3;
		while(tentativas > 0) {
			tentativas --;
			
			try {
				return scan.nextInt();
				
			} catch (InputMismatchException e) {
				scan.next();
				System.out.println("O valor informado deve ser um inteiro. \nTente novamente. Você tem " + tentativas + " tentativas");
			} finally {
				System.out.println("Fim");
			}
		}
		return 1;
	}
}
