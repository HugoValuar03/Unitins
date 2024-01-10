package enumaradores;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		Telefone telefone = new Telefone();
		
		System.out.println("Informe o id: ");
		telefone.setId(scan.nextInt());
		
		System.out.println("Informe o nome: ");
		telefone.setNome(scan.next());
		
		System.out.println("Selecione uma das opções de cores: ");
		for (Cor cor : Cor.values()) {
			System.out.println(cor.getId() + " - " + cor.getDescricao());
		}
		
		telefone.setCor(Cor.valueOf(scan.nextInt()));
		
	
		
		System.out.println(telefone);
		
		
		
	}
}
