package herança.modelo;

public class Retangulo {

	private int altura;
	private int largura;

	public Retangulo(int altura, int largura) {
		System.out.println("Construir retangulo");
		this.altura = altura;
		this.largura = largura;
	}
	
	public int getAltura() {
		return altura;
	}
	private void setAltura(int altura) {
		this.altura = altura;
	}
	public int getLargura() {
		return largura;
	}
	private void setLargura(int largura) {
		this.largura = largura;
	}
	
	public void imprimir() {
		System.out.println("Largura: " + getLargura());
		System.out.println("Altura: " + getAltura());
	}
}
