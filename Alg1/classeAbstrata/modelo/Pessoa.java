package classeAbstrata.modelo;

public abstract class Pessoa {
	
	private String nome;

	public String getNome() { //metodo concreto
		var x = 10; // recebendo um tipo de variavel e a varial vai ser do tipo que ela receber e não poe ser modificado
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void imprimir(); //metodo abstratoc - todas as classes devem implementar esses metodos, por ser a classe pai -- public ou protected
	
	
}
