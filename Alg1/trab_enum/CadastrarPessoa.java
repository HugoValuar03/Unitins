package trab_enum;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CadastrarPessoa {

	public static void main(String[] args) {
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");	
				
		Scanner entrada = new Scanner(System.in);
		
		Pessoa[] pessoa = new Pessoa[5];
		
		for (int i = 0; i < pessoa.length; i++) {
			Pessoa p = new Pessoa();
			System.out.println("Cadastro n° " + i);
			
			System.out.println("Nome Completo: ");
			p.setNome(entrada.nextLine());
			
			System.out.println("Data de Nascimento: ");
			String dataNascimento = entrada.nextLine();
			LocalDate data = LocalDate.parse(dataNascimento, formatador);
			p.setDataNascimento(data);
			
			System.out.println("Escolha uma dentre as seguintes opções: Casado, Solteiro, Namorando, Divorciado, Viuvo");
			String relacionamento = entrada.nextLine();
			
			switch (relacionamento) {
			
			case "Casado":
				p.setRelacionamento(StatusRelacionamento.CASADO);
				break;
			case "Solteiro":
				p.setRelacionamento(StatusRelacionamento.SOLTEIRO);
				break;
			case "Namorando":
				p.setRelacionamento(StatusRelacionamento.SOLTEIRO);
				break;
			case "Divorciado":
				p.setRelacionamento(StatusRelacionamento.DIVORCIADO);
				break;
			case "Viuvo":
				p.setRelacionamento(StatusRelacionamento.VIUVO);
				break;
			case "Viúvo":
				p.setRelacionamento(StatusRelacionamento.VIUVO);
				break;
			}
			
			pessoa[i] = p;
		}
		
		for (Pessoa pe : pessoa) {
			System.out.println("Nome: " + pe.getNome());
			System.out.println("Data de Nascimento: " + pe.getDataNascimento());
			System.out.println("Status de relacionamento: " + pe.getRelacionamento());
			System.out.println();
		}
	}
}
