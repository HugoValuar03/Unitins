package trab_Polimorfismo;

import java.util.Scanner;

public class Matematica {
	
	public void painel(){
		
		float numero1;
		float numero2;
		 
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma opção");
		System.out.println("1. Somar");
		System.out.println("2. Subtrair");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		int opcao = entrada.nextInt();
		
		switch(opcao) {
		
		case 1:
			System.out.println("Digite o número:");
			numero1 = entrada.nextFloat();
			System.out.println("Digite outro número:");
			numero2 = entrada.nextFloat();
			System.out.println("O resultado é: " + somar(numero1, numero2));
			break;
			
		case 2:
			System.out.println("Digite o número:");
			numero1 = entrada.nextInt();
			System.out.println("Digite outro número:");
			numero2 = entrada.nextInt();
			System.out.println("O resultado é: " + subtrair(numero1, numero2));
			break;
			
		case 3:
			System.out.println("Digite o número:");
			numero1 = entrada.nextInt();
			System.out.println("Digite outro número:");
			numero2 = entrada.nextInt();
			System.out.println("O resultado é: " + multiplicar(numero1, numero2));
			break;
			
		case 4:
			System.out.println("Digite o número:");
			numero1 = entrada.nextInt();
			System.out.println("Digite outro número:");
			numero2 = entrada.nextInt();
			System.out.println("O resultado é: " + dividir(numero1, numero2));
			break;
		}
	}
	
	
	
	public int somar(int a, int b) {
		return a + b;
	}
	
	public int somar(int a, float b) {
		return a + (int) b;
	}
	
	public float somar(float a, float b) {
		return a + b;
	}
	
	public int subtrair(int a, int b) {
		return a - b;
	}
	
	public int subtrair(int a, float b) {
		return a - (int) b;
	}
	
	public int subtrair(float a, float b) {
		return (int)(a - b);
	}
	public int multiplicar(int a, int b) {
		return a * b;
	}
	
	public int multiplicar(int a, float b) {
		return a *(int) b;
	}
	
	public int multiplicar(float a, double b) {
		return (int) (a*b);
	}
	
	public int dividir(int a, int b) {
		return a / b;
	}
	
	public int dividir(int a, float b) {
		return a / (int) b;
	}
	
	public int dividir(float a, float b) {
		return (int)(a / b);
	}
	
//	public int somarInteiro(int v1, int v2) {
//		return v1+v2;
//	}
//	public int somarInteiro(int v1, double v2) {
//		return v1+(int)v2;
//	}
//	
//	public int somarInteiro(double v1, double v2) {
//		return (int)(v1+v2);
//		//return (int)v1+(int)v2; //sobrecarga -  
//	}
//	
//	
//	public int somarInteiro(double v1, int v2) {
//		return (int)v1+v2;
}
