package trabalhoLista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		List<Pessoa> lista = new ArrayList<>();
		@SuppressWarnings("resource")
		Scanner cadastro = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner filtro = new Scanner(System.in);
		
		String respostaCadastro = "sim";
		String respostaFiltro = "sim";
		Integer respostaPainel = null;
		
		while(!respostaCadastro.equalsIgnoreCase("não")) {	
			System.out.println("Deseja cadastrar uma pessoa?");
			respostaCadastro = cadastro.next();
			if(respostaCadastro.equalsIgnoreCase("sim")) {
				Pessoa pessoa = lerDados();
				lista.add(pessoa);
			} else if(respostaCadastro.equalsIgnoreCase("não")){
				imprimirLista(lista);
			}
		}
		
		while(!respostaFiltro.equalsIgnoreCase("não")) {	
			System.out.println("Deseja filtrar?");
			respostaFiltro = cadastro.next();
			if(respostaFiltro.equalsIgnoreCase("sim")) {
				painel();
				respostaPainel = filtro.nextInt();
				switch(respostaPainel) {
				
				case 1:
					imprimirListaOrdernadaPorNome(lista);
					System.out.println();
					break;
				case 2: 
					imprimirListaOrdernadaPorIdade(lista);
					System.out.println();
					break;
				case 3:
					imprimirListaOrdenadaPorSexo(lista);
					System.out.println();
				}
			}
		}
	}
	
	public static void painel() {
		System.out.println("Qual filtro deseja ultilizar?");
		System.out.println("1 - Filtrar por nome");
		System.out.println("2 - Filtrar por idade");
		System.out.println("3 - Imprimir somente os homens");
	}
	
	public static Pessoa lerDados() {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.next();
		
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.println("Digite seu sexo (1 p/ Masculino ou 2 p/ Feminino): ");
		int sexoInt = entrada.nextInt();
		Sexo sexo = Sexo.valueOf(sexoInt);
		
		System.out.println("Digite seu DDD: ");
		String codigoArea = entrada.next();
		System.out.println("Digite seu numero: ");
		String numero = entrada.next();		
		
		entrada.nextLine();
		
		return new Pessoa(nome, idade, sexo, new Telefone(codigoArea, numero));
	}
	
	public static void imprimirLista(List<Pessoa> lista) {
		System.out.println("Impressão completa:");
		lista.forEach(pessoa -> {
			pessoa.imprimir();
			pessoa.getTelefone().imprimir();
			System.out.println();
		});
	}
	
	public static void imprimirListaOrdernadaPorNome(List<Pessoa> lista) {
		lista.sort((p1,p2) -> p1.getNome().compareTo(p2.getNome()));
		imprimirLista(lista);	
	}
	
	public static void imprimirListaOrdernadaPorIdade(List<Pessoa> lista) {
		lista.sort((p1,p2) -> p1.getIdade().compareTo(p2.getIdade()));
		imprimirLista(lista);
	}
	
	public static void imprimirListaOrdenadaPorSexo(List<Pessoa> lista) {
		lista.sort((p1,p2) -> p1.getSexo().compareTo(p2.getSexo()));
		Principal principal = new Principal();
		principal.imprimirLista(lista,Sexo.MASCULINO);
	}
	
	public void imprimirLista(List<Pessoa> lista, Sexo sexo) {
		lista.stream()
			.filter(pessoa -> pessoa.getSexo() == sexo)
			.forEach(p -> {
				p.imprimir();
				p.getTelefone().imprimir();
				System.out.println();
			});
	}
}
