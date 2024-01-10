package explicacao_interface.Trabalho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		String genero;
		
		Scanner cadastro = new Scanner(System.in);
		List<Pessoa> lista = new ArrayList<>();
		
		for (int i = 1; i <= 4; i++) {
			System.out.println("Digite o nome");
			pessoa.setNome(cadastro.next());
			System.out.println("Digite o cpf");
			pessoa.setCpf(cadastro.next());
			System.out.println("Digite o sexo (Masculino/Feminino)");
			genero = cadastro.next().toUpperCase();
			System.out.println("");
			Sexo sexo = Sexo.valueOf(genero);
			
			switch(sexo) {
			case MASCULINO:
				pessoa.setSexo(Sexo.MASCULINO);
				break;
			case FEMININO:
				pessoa.setSexo(Sexo.FEMININO);
				break;
			}
			lista.add(new Pessoa(pessoa.getNome(),pessoa.getCpf(), pessoa.getSexo()));
		}
		
		imprimirTudo(lista);
		
		System.out.println(" ");
		
		List<Pessoa> listaSecundaria = new ArrayList<>();
		for (Pessoa p : lista) {
			if(p.getSexo().equals(Sexo.FEMININO)) {
				listaSecundaria.add(p);
			}
		}
		
		imprimirTudo(listaSecundaria);
	}
	
	public static void imprimirTudo(List<Pessoa> lista) {
		for (Pessoa p : lista) {
			System.out.println(p);
		}
	}
}
