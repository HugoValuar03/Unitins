package sistemaLanchonete;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lanchonete implements CRUD{

	Scanner scan = new Scanner(System.in);
	Map<String, Produto> produtosMap = new HashMap<>();
	
	
	public static void main(String[] args) {
		Lanchonete lanchonete = new Lanchonete();
		Produto produto = new Produto();
		Scanner scan2 = new Scanner(System.in);
		int opcao = 0;
		
		do {
			menu();
				try {
					opcao = scan2.nextInt();
				} catch (InputMismatchException i) {
					System.out.println();
					System.out.println("Insira um número válido");
					System.out.println();
					scan2.nextLine();
				}
			
			try {				
				switch(opcao) {
				
				case 1: 
					lanchonete.inserir(produto);
					System.out.println("Produto cadastrado!");
					break;
				case 2: 
					System.out.println("Selecione a posição do item: ");
					int posicao = scan2.nextInt();
					lanchonete.excluir(posicao);
					break;
					
				case 3:
					System.out.println("Selecione uma opção:");
					System.out.println("1. Listar somente bebidas");
					System.out.println("2. Listar somente Comidas");
					System.out.println("3. Listar tudo");
					int listar = scan2.nextInt();
					
					switch(listar) {
					
					case 1:
						lanchonete.listarTodasBebidas();
						break;
					case 2:
						lanchonete.listarTodasComidas();
						break;
					case 3:
						lanchonete.listarTodosProdutos();
						break;
					}
					break;
				case 4: 
					lanchonete.ordenarProdutosPorNome();
					break;
				case 5: 
					lanchonete.ordenarComidasPorPrecoCrescente();
					break;
				case 6:
					lanchonete.ordenarBebidasPorPrecoCrescente();
					break;
				case 7: 
					System.out.println("Obrigado por usar volte sempre");
					break;
				}
			} catch(Exception e) {
					System.out.println("Ocorreu um erro");
			}
		} while (opcao != 7);
	}
	
	public static void menu() {
		System.out.println("Digite a opção desejada:");
		System.out.println("1.Inserir um produto:");
		System.out.println("2.Excluir um produto");
		System.out.println("3.Listar os produtos");
		System.out.println("4.Ordenar por Nome");
		System.out.println("5.Ordenar por Comida");
		System.out.println("6.Ordenar por Bebida");		
		System.out.println("7.Sair");
	}
	
	public void ordenarProdutosPorNome() {
	    // Obtém uma lista de entradas do mapa, ordenada por chave (nome do produto)
	    List<Map.Entry<String, Produto>> listaOrdenada = produtosMap.entrySet().stream()
	            .sorted(Map.Entry.comparingByKey()) // Ordena as entradas por chave (nome)
	            .collect(Collectors.toList()); // Coleta os resultados em uma lista

	    // Imprime a mensagem indicando que os produtos estão ordenados por nome
	    System.out.println("Produtos ordenados por nome:");

	    // Itera sobre as entradas ordenadas e exibe detalhes dos produtos
	    for (Map.Entry<String, Produto> entrada : listaOrdenada) {
	        Produto produto = entrada.getValue(); // Obtém o produto da entrada
	        // Imprime os detalhes do produto: nome, tipo, valor e data de validade
	        System.out.println("Nome: " + entrada.getKey() +
	                "\nTipo: " + (produto instanceof Bebida ? "Bebida" : "Comida") +
	                "\nValor: " + produto.getValor() +
	                "\nData de Validade: " + produto.getData());
	    }
	}
	
	public void ordenarComidasPorPrecoCrescente() {
	    List<Comida> comidasOrdenadas = produtosMap.values().stream()
	            .filter(produto -> produto instanceof Comida)
	            .map(produto -> (Comida) produto)
	            .sorted(Comparator.comparing(Produto::getValor))
	            .collect(Collectors.toList());

	    System.out.println("Comidas ordenadas por preço crescente:");
	    for (Comida comida : comidasOrdenadas) {
	        System.out.println("Nome: " + comida.getNome() +
	                ", Tipo: " + comida.getTipoComida() +
	                ", Valor: " + comida.getValor() +
	                ", Data de Validade: " + comida.getData());
	    }
	}

	public void ordenarBebidasPorPrecoCrescente() {
	    List<Bebida> bebidasOrdenadas = produtosMap.values().stream()
	            .filter(produto -> produto instanceof Bebida)
	            .map(produto -> (Bebida) produto)
	            .sorted(Comparator.comparing(Produto::getValor))
	            .collect(Collectors.toList());

	    System.out.println("Bebidas ordenadas por preço crescente:");
	    for (Bebida bebida : bebidasOrdenadas) {
	        System.out.println("Nome: " + bebida.getNome() +
	                ", Tipo: " + bebida.getTipoBebida() +
	                ", Valor: " + bebida.getValor() +
	                ", Data de Validade: " + bebida.getData());
	    }
	}

	@Override
	public void inserir(Produto produto) {
		System.out.println("Escolha o produto:");
		System.out.println("1. Bebida");
		System.out.println("2. Comida");
		int tipo = scan.nextInt();

		if(tipo == 1) {
			
			System.out.println("Digite o nome da bebida:");
			String nome = scan.next();
			scan.nextLine();
			System.out.println("Digite o valor da bebida");
			Double valor = scan.nextDouble();
			scan.nextLine();
			System.out.println("Digite a data de validade");
			String data = scan.next(); 
			DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate date = LocalDate.parse(data, formatar);
			produto.setData(date);
			
			System.out.println("Selecione a bebida");
			System.out.println("1. Refrigerante");
			System.out.println("2. Suco");
			System.out.println("3. Água");
			System.out.println("4. Cerveja");
			int opcao = scan.nextInt();
			
			TipoBebida tipoBebida = null;
			switch(opcao) {
				case 1:
					tipoBebida = TipoBebida.REFRIGERANTE;
					break;
				case 2: 
					tipoBebida = TipoBebida.SUCO;
					break;
				case 3:
					tipoBebida = TipoBebida.AGUA;
					break;
				case 4:
					tipoBebida = TipoBebida.CERVEJA;
					break;
				}			
			Bebida novaBebida = new Bebida(nome, valor, date, tipoBebida);
			produtosMap.put(nome, novaBebida);
		} else if(tipo == 2){
			System.out.println("Digite o nome da comida:");
			String nome = scan.next();
			scan.nextLine();
			System.out.println("Digite o valor da comida");
			Double valor = scan.nextDouble();
			scan.nextLine();
			System.out.println("Digite a data de validade");
			String data = scan.next(); 
			DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate date = LocalDate.parse(data, formatar);
			produto.setData(date);
			
			System.out.println("Selecione a comida");
			System.out.println("1. Sanduiche");
			System.out.println("2. Pizza");
			System.out.println("3. Batata Frita");
			int opcao = scan.nextInt();
			
			TipoComida tipoComida = null;
			switch(opcao) {
				case 1:
					tipoComida = TipoComida.SANDUICHE;
					break;
				case 2: 
					tipoComida = TipoComida.PIZZA;
					break;
				case 3:
					tipoComida = TipoComida.BATATA_FRITA;
					break;
				default:
					System.out.println("Digite um opção valida");
					break;
			}
			Comida novaComida = new Comida(nome, valor, date, tipoComida);
			produtosMap.put(nome, novaComida);
		}
	}

	@Override
	public void excluir(int posicao) {
		if (posicao >= 0 && posicao < produtosMap.size()) {
	        String nome = produtosMap.keySet().toArray(new String[0])[posicao];
	        produtosMap.remove(nome);
	        System.out.println("Produto na posição " + posicao + " removido com sucesso.");
	    } else {
	        System.out.println("Posição inválida.");
	    }
	}

	@Override
	public void listarTodosProdutos() {
		for(Map.Entry<String, Produto> lista : produtosMap.entrySet()){
			String nome = lista.getKey();
			Produto produto = lista.getValue();
				if(produto instanceof Bebida) {
					Bebida bebida = (Bebida) produto;
					System.out.println("Nome: " + nome);
					System.out.println("Tipo de Bebida: " + bebida.getTipoBebida());
					System.out.println("Valor: " + produto.getValor());
					System.out.println("Data de Validade: " + produto.getData());
					System.out.println();
				} else if(produto instanceof Comida) {
					Comida comida = (Comida) produto;
					System.out.println("Nome: " + nome);
					System.out.println("Tipo da Comida: " + comida.getTipoComida());
					System.out.println("Valor: " + produto.getValor());
					System.out.println("Data de Validade: " + produto.getData());
					System.out.println();
				}
		}
		
	}

	@Override
	public void listarTodasComidas() {
		for(Map.Entry<String, Produto> lista : produtosMap.entrySet()){
			String nome = lista.getKey();
			Produto produto = lista.getValue();
			if(produto instanceof Comida) {
				Comida comida = (Comida) produto;
				System.out.println("Nome: " + nome);
				System.out.println("Tipo de Comida: " + comida.getTipoComida());
				System.out.println("Valor: " + produto.getValor());
				System.out.println("Data de Validade: " + produto.getData());
				System.out.println();
			}
		}
	}

	@Override
	public void listarTodasBebidas() {
		for(Map.Entry<String, Produto> lista : produtosMap.entrySet()){
			String nome = lista.getKey();
			Produto produto = lista.getValue();
			if(produto instanceof Bebida) {
				Bebida bebida = (Bebida) produto;
				System.out.println("Nome: " + nome);
				System.out.println("Tipo de Bebida: " + bebida.getTipoBebida());
				System.out.println("Valor: " + produto.getValor());
				System.out.println("Data de Validade: " + produto.getData());
				System.out.println();
			}
		}
	}
}
