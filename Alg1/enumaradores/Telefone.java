package enumaradores;

public class Telefone {

	public static int AZUL = 10;
	
	private int id;
	private String nome;
	private Cor cor;
	
	@Override
	public String toString() {
		return "Telefone [id=" + id + ", nome=" + nome + ", cor=" + cor + "]";
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Cor getCor() {
		return cor;
	}
	
	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	
}
