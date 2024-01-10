package farmáciaProduto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FarmaciaCliente {

	List<Cliente> clientes = new ArrayList<>();
	List<Vendedor> vendedor = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		FarmaciaCliente farmacia = new FarmaciaCliente();
		
			farmacia.menuInicial();
			int opcaoInicial = scan.nextInt();
		
		switch(opcaoInicial) {
		
		case 1: 
			
		case 2:
			
			farmacia.cadastrarNovoFuncionario();
			break;
			
		}
	}
	
	public void menuInicial() {
		System.out.println("Como deseja logar?");
		
	}
	
	public void cadastrarNovoFuncionario() {

			System.out.println("Insira o nome de usuário");
			scan.nextLine();
			String nome = scan.next();
			
			System.out.println("Insira a senha");
			scan.nextLine();
			String senha = scan.next();
		
		Vendedor novoVendedor = new Vendedor(nome, senha);
		
		vendedor.add(novoVendedor);
		System.out.println("Vendedor Cadastrado!");
		
	}
	
	public void cadastrarNovoVendedor() {
		
	}
}
