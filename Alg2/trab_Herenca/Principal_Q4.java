package trab_Herenca;

public class Principal_Q4 {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		imprimir(pf);
		imprimir(pj);
	}
	
	public static void imprimir(Pessoa pessoa) {
		if(pessoa instanceof PessoaFisica) {
			System.out.println(((PessoaFisica)pessoa).getCpf());
		}
		if(pessoa instanceof PessoaJuridica) {
			
			System.out.println(((PessoaJuridica)pessoa).getCnpj());		
		}
	}
}
