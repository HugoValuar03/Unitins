package modelo;

public interface InterRadio {
	
	void ligar(); //todo metodo a principio é abstrato - todo metodo sem corpo é abstrato - por padrao é public e abstrato
	public abstract void desligar();
	void mudarEstacao(Float valor);
	
}
