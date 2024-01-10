package sistemaLanchonete;

public interface CRUD {

	public void inserir(Produto produto);
	public void excluir(int posicao);
	public void listarTodosProdutos();
	public void listarTodasComidas();
	public void listarTodasBebidas();
	
}
