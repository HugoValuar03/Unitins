package trab_Polimorfismo;

public class Questao2 {
	
	public int multiplicar(int v1, float v2) {
		return v1*(int)v2;
	}
	
	public int multiplicar(float v1, double v2) {
		return (int)v1*(int)v2;
	} 
	
	public int multiplicar(int v1, double v2) {
		return v1*(int)v2;
	}
	
}
