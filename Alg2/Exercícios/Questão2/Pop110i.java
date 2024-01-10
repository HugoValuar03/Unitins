package Exercícios.Questão2;

public class Pop110i {

	double velocidade = 0.0;
	double peso = 87;
	double cilindrada = 109.1;
	
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
