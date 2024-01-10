package Exercícios.Questão2;

public class Kwid {
	
	double velocidade = 0.0;
	double peso = 820;
	double cilindrada = 999;
	
	public double acelerar() {
		velocidade = velocidade + 5;
		velocidade += velocidade * (0.15*(cilindrada/1000)) - (peso/300);
		return velocidade;
	}
	
	public double frear() {
		velocidade -= (velocidade*(25/100));
		return velocidade;
	}

}
