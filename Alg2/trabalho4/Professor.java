package trabalho4;

public class Professor {

	private String nome;
	private int idade;
	private String cpf;
	private int idProfessor;
	
	public void cadastroAlunos() {
		Estudante aluno1 = new Estudante();
		
		aluno1.setNome("Hugo");
		aluno1.setIdade(18);
		aluno1.setMatricula(123456789);
		aluno1.setCpf("0123456");
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}
	
	
}
