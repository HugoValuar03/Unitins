package trab_Polimorfismo;

public class Principal_Questão2 {

	public static void main(String[] args) {
		
		Questao2 q2 = new Questao2();
		
		System.out.println("Multiplicação de int com float: " + q2.multiplicar(5, 6.5f));
		System.out.println("Multiplicação de float com double: " + q2.multiplicar(5.4f, 6.4));
		System.out.println("Multiplicação de int com double: " + q2.multiplicar(6, 4.3));
		
		
	}
}
