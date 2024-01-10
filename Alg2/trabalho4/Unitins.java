package trabalho4;

public class Unitins {

	private String curso;
	private int duracaoAno;
	private String materia;
	private String professor;
	
	Unitins novoCadastro = new Unitins("Sitemas de Informação", 4, "Algoritmo", "Jânio");
	Alunos novoAluno = new Alunos("Hugo", 18, "123123", 2023101010);
	
	public Unitins(String curso, int duracaoAno, String materia, String professor) {
		super();
		this.curso = curso;
		this.duracaoAno = duracaoAno;
		this.materia = materia;
		this.professor = professor;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getDuracaoAno() {
		return duracaoAno;
	}

	public void setDuracaoAno(int duracaoAno) {
		this.duracaoAno = duracaoAno;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	

}
