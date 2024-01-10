package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal2 {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Não está lendo o nome completo
		System.out.println("Informe a idade: ");
		Integer idade = scan.nextInt();
		
		System.out.println("Informe o nome completo: ");
		String nome = scan.nextLine();
		
		System.out.println("nome: " + nome);
		System.out.println("Idade: " + idade);
		
		//Solução 1
		System.out.println("Informe a idade: ");
		Integer idade1 = scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("Informe o nome completo: ");
		String nome1 = scan.nextLine();
		
		System.out.println("nome: " + nome1);
		System.out.println("Idade: " + idade1);
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
