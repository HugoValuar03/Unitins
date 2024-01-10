package trabalho5;

import java.time.LocalDate;
import java.util.Scanner;

public class Unitins {
	
	Estudante estudante = new Estudante();

	private String curso;
	private int duracaoAno;
	private String materia;
	private String professor;
	private Estudante[] novoEstudante;
	private int contadorEstudantes;
	
	

	public Unitins() {
		contadorEstudantes = 0;
		novoEstudante = new Estudante[30];
	}
	
	public Unitins(String curso, int duracaoAno, String materia, String professor) {
		this.curso = curso;
		this.duracaoAno = duracaoAno;
		this.materia = materia;
		this.professor = professor;
	}
	
	public void adicionarEstudante() {
		Scanner matricula = new Scanner(System.in);
		Estudante estudante = new Estudante();
		System.out.println("Digite o nome do aluno: ");
		estudante.setNome(matricula.next());
		System.out.println("Digite a idade: ");
		estudante.setIdade(matricula.nextInt());
		System.out.println("Digite a matricula");
		estudante.setMatricula(matricula.nextInt());
		System.out.println("Digite o CPF");
		estudante.setCpf(matricula.next());
		System.out.println("Digite a data de nascimento no formato (yyyy-MM-dd)");
		String dataDigitada = matricula.next();
		estudante.setDataNascimento(LocalDate.parse(dataDigitada));
		
		novoEstudante[contadorEstudantes] = estudante;
		contadorEstudantes++;
	}
	
	public void imprimirEstudantes() {		
		for(int i = 0; i < contadorEstudantes; i++) {
			Estudante estudante = novoEstudante[i];		
				System.out.println("Nome: " + estudante.getNome());
				System.out.println("Idade: " + estudante.getIdade());
				System.out.println("CPF: " + estudante.getCpf());
				System.out.println("Matricula: " + estudante.getMatricula());
				System.out.println("Data de Nascimento: " + estudante.getDataNascimento());
				System.out.println(" ");
		}
	}
		
	public void filtrarPorMatricula() {
		
		Scanner buscar = new Scanner(System.in);
		
		System.out.println("Digite o número da matrícula: ");
		int matricula = buscar.nextInt();
		
		for (int i = 0; i < contadorEstudantes; i++) {
			Estudante estudante = novoEstudante[i];
			if(estudante.getMatricula() == matricula) {
				System.out.println("Nome: " + estudante.getNome());
				System.out.println("Idade: " + estudante.getIdade());
				System.out.println("CPF: " + estudante.getCpf());
				System.out.println("Matricula: " + estudante.getMatricula());
				System.out.println("Data de Nascimento: " + estudante.getDataNascimento());
				System.out.println(" ");
			}
		}
		
	}
	
	public void menu() {
		System.out.println("MENU");
		System.out.println("1. Cadastrar aluno");
		System.out.println("2. Listar todos os alunos");
		System.out.println("3. Filtrar por matricula");
		System.out.println("0. Para sair");
		System.out.println("Escolha uma opção");
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
	
	public int getContadorEstudantes() {
		return contadorEstudantes;
	}
	
	public void setContadorEstudantes(int contadorEstudantes) {
		this.contadorEstudantes = contadorEstudantes;
	}
}