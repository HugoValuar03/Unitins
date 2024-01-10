package sistemaLanchonete;

import java.time.LocalDate;

public class Comida extends Produto{

	private TipoComida tipoComida;

	public TipoComida getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(TipoComida tipoComida) {
		this.tipoComida = tipoComida;
	}

	public Comida(String nome, Double valor, LocalDate data, TipoComida tipoComida) {
		super(nome, valor, data);
		this.tipoComida = tipoComida;
	}
	
}
