package app;

import modelo.Pessoa;
import modelo.PessoaFisica;

public class Principal {

	public static void main(String[] args) {

//		Pessoa p = new Pessoa();
//		p.setNome("Leandra");
		
		PessoaFisica p = new PessoaFisica();
		p.setNome("Leandra");
		p.setCpf("111111111");
		
		imprimir(p);
		
		
		
		
//		Pessoa p1 = new PessoaFisica(); // classe concreta
//		imprimir(new PessoaFisica());
//		imprimir(new PessoaJuridica());
//		imprimir(p1);
	}
	
	public static void imprimir(Pessoa p) {
		p.imprimir(); // so mandar imprimir o metodo da instacia
	}
	
//	public static void imprimir(Pessoa p) {
//		if(p instanceof PessoaFisica) { //só precisa do instanceof se nao estiver utilizando abstract na classe Pai
//			((PessoaFisica)p).imprimir();
//		}
//		
//		if(p instanceof PessoaJuridica) {
//			((PessoaJuridica)p).imprimir();
//		}
//	}

}
