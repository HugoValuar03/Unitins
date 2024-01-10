package trabalho4;

public class Estudante {

	private String nome;
	private int idade;
	private String cpf;
	private int matricula;
	
	public void Professores() {
		
		Professor prof1 = new Professor();
		
		prof1.setNome("Jânio");
		prof1.setIdade(37);
		prof1.setCpf("123456");
		prof1.setIdProfessor(111);
		
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
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
}
