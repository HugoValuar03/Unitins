package sistemaLanchonete;

import java.time.LocalDate;
import java.util.Objects;

public class Produto {

	private String nome;
	private Double valor;
	private LocalDate data;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", valor=" + valor + ", data=" + data + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, nome, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(data, other.data) && Objects.equals(nome, other.nome)
				&& Objects.equals(valor, other.valor);
	}

	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}

	public Produto(String nome, Double valor, LocalDate data) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.data = data;
	}

	public Produto() {
		super();
	}
	
	
}
