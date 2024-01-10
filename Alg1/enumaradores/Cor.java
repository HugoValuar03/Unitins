package enumaradores;

public enum Cor {

	AZUL(1, "Azul"),
	BRANCA(2, "Branca"),
	PRETA(3, "Preta");
	
	private final int id;
	private final String descricao;
	
	private Cor(int id, String descricao){
		this.id = id;
		this.descricao = descricao;
	}
	
	public int getId() {
		return id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static Cor valueOf(Integer id) {
		for (Cor cor : Cor.values()) {
			if(cor.getId() == id) {
				return cor;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		return this.getDescricao();
	}
}
