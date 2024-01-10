package sistemaLanchonete;

import java.time.LocalDate;

public class Bebida extends Produto{

	private TipoBebida tipoBebida;

	public TipoBebida getTipoBebida() {
		return tipoBebida;
	}

	public void setTipoBebida(TipoBebida tipoBebida) {
		this.tipoBebida = tipoBebida;
	}

	public Bebida(String nome, Double valor, LocalDate data, TipoBebida tipoBebida) {
		super(nome, valor, data);
		this.tipoBebida = tipoBebida;
	}
	
	public Bebida() {
		
	}
}
