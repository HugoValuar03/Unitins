package Exercícios.Questão1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Aluno[] alunos = lerAluno();
		imprimir(alunos);
		
	}
	
	public static Aluno[] lerAluno() {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos deseja cadastrar?");
        int numAlunos = entrada.nextInt();
		
		Aluno[] AlunoVetor = new Aluno[numAlunos];
		
		
		for (int i = 0; i < AlunoVetor.length; i++) {
			Aluno aluno = new Aluno();
			Telefone telefone = new Telefone();
			
			System.out.println("Nome: ");
			aluno.nome = entrada.next();
			System.out.println("Idade: ");
			aluno.idade = entrada.nextInt();
			System.out.println("CPF: ");
			aluno.cpf = entrada.next();
			System.out.println("Telefone com DDD: ");
			telefone.numero = entrada.nextLong();
			aluno.telefone = telefone;
			System.out.println("Nota A1: ");
			aluno.notaA1 = entrada.nextDouble();
			System.out.println("Nota A2: ");
			aluno.notaA2 = entrada.nextDouble();						
			
				
			AlunoVetor[i] = aluno;
		}	
		entrada.close();
		return AlunoVetor;		
	}
	
	public static void imprimir(Aluno[] vetAluno) {
		
		for (int i = 0; i < vetAluno.length; i++) {
			System.out.println("Nome: " + vetAluno[i].nome);
			System.out.println("Idade: " + vetAluno[i].idade);
			System.out.println("CPF: " + vetAluno[i].cpf);
			System.out.println("Número de telefone: " + vetAluno[i].telefone.conversorTexto());
			System.out.println("Nota A1: " + vetAluno[i].notaA1);
			System.out.println("Nota A2: " + vetAluno[i].notaA2);
			System.out.println("Média: " + media(vetAluno[i]));
			System.out.println("Situação acadêmica: " + (media(vetAluno[i]) < 6 ? "Reprovado" : "Aprovado"));
			System.out.println(" ");
		}	
			
	}
	
	public static double media(Aluno aluno) {
		double media = (aluno.notaA1 + aluno.notaA2)/2;
		
		return media;
		
	}
}
