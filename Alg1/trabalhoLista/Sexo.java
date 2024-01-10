package trabalhoLista;

public enum Sexo {

	MASCULINO(1),
	FEMININO(2);
	
	private final int id;

	public int getId() {
		return id;
	}

	private Sexo(int id) {
		this.id = id;
	}
	
	public static Sexo valueOf(Integer id) {
		for (Sexo sexo : Sexo.values()) {
			if(sexo.getId() == id) {
				return sexo;
			}
		}
		return null;
	}
}
