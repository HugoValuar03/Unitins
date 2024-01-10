package explicacao_interface.List;

import java.util.Objects;

public class Carro {

	private String modelo;
	private String marca;
	
	public Carro(String modelo, String marca) {
		super();
		this.modelo = modelo;
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca, modelo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo);
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
