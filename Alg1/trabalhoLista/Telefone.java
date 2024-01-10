package trabalhoLista;

public class Telefone implements Impressao{

	private String codigoArea;
	private String numero;
	
	public String getCodigoArea() {
		return codigoArea;
	}
	

	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Telefone: " + codigoArea + "\nNumero: " + numero;
	}

	@Override
	public void imprimir() {
		System.out.println("(" + getCodigoArea() + ") " + getNumero());
	}
	
	public Telefone() {
		
	}
	
	public Telefone(String codigoArea, String numero) {
		super();
		this.codigoArea = codigoArea;
		this.numero = numero;
	}
	
}
