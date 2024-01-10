package consumer;

import java.util.Comparator;
import java.util.Objects;

public class Carro implements Comparable<Carro>{

	private String placa;
	private String nome;
	private String marca;
	
	
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Carro(String nome, String marca) {
		super();
		this.nome = nome;
		this.marca = marca;
	}

	public Carro() {
		
	}

	@Override
	public String toString() {
		return "Carro nome=" + nome + ", marca=" + marca;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca, nome);
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
		return Objects.equals(marca, other.marca) && Objects.equals(nome, other.nome);
	}

	@Override
	public int compareTo(Carro c) {
		return this.nome.compareTo(c.nome);
	}
	
	public static Comparator<Carro> comparatorNome() {
		return ((c1, c2) -> c1.getNome().compareTo(c2.getNome()));
	}
	
	public static Comparator<Carro> comparatorMarca() {
		return ((c1, c2) -> c1.getMarca().compareTo(c2.getMarca()));
	}

	
}
