package modelo;

public class Radio implements InterRadio{
	private Float estacao;
	
	private Boolean ligado;

	public Boolean getLigado() {
		return ligado;
	}

	public void setLigado(Boolean ligado) {
		this.ligado = ligado;
	}

	public Float getEstacao() {
		return estacao;
	}

	public void setEstacao(Float estacao) {
		this.estacao = estacao;
	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mudarEstacao(Float valor) {
		// TODO Auto-generated method stub
		
	}
	
	
}
