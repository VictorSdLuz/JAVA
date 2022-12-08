package labSchool;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Collections;


public class aluno extends pessoa{
	
	static String Condição;
	int Nota;
	int qtdAtendimentoAluno=0;

	
	
	public String getCondição() {
		return Condição;
	}
	public static void setCondição(String condição) {
		Condição = condição;
	}
	public int getNota() {
		return Nota;
	}
	public void setNota(int nota) {
		Nota = nota;
	}
	public int getQtdAtendimentoAluno() {
		return qtdAtendimentoAluno;
	}
	public void setQtdAtendimentoAluno(int qtdAtendimentoAluno) {
		this.qtdAtendimentoAluno = qtdAtendimentoAluno;
	}
		
	void condição() {
		
		Scanner condicaoScanner = new Scanner(System.in);
		System.out.println("Assinale a condição do aluno: \n"
				+ "\n"
				+ "Digite 1 para ATIVO \n"
				+ "Digite 2 para IRREGULAR \n"
				+ "Digite 3 para ATENDIMENTO\n"
				+ "Digite 4 para INATIVO \n");
		int respostaCondicao = condicaoScanner.nextInt();
		
		switch(respostaCondicao) {
		
		case 1:
			Scanner segundaAcaoScan = new Scanner(System.in);
			System.out.println("Você selecionou 1 \n");				
			aluno.setCondição("ATIVO");
			break;
				
		case 2:
			System.out.println("Você selecionou 2 \n");
			aluno.setCondição("IRREGULAR");
			break;
				
		case 3:
			System.out.println("Você selecionou 3 \n");
			aluno.setCondição("ATENDIMENTO");
			break;
			
		case 4:
			System.out.println("Você selecionou 4 \n");
			aluno.setCondição("INATIVO");
			break;
				
		default: condição(); break;	
		}
	}
	
	public String toString() {
		String myString = "DADOS DO NOVO ALUNO: \n" + "Nome: "+ Nome + "\n" +"Telefone: "+ Telefone + "\n" +  "Data de nascimento: " 
			+ dataNascimento + "\n" + "CPF: " +Cpf + "\n" + "ID: " +Id + "\n" +"Condição: " + Condição + "\n" +"Nota: " 
			+ Nota + "\n" + "Quantidade de atendimentos: " +qtdAtendimentoAluno + "\n";
		return myString;
	}

	
	
	static void cadastro() {
		System.out.println("Vamos começar:  \n");
		aluno aluno = new aluno();	
		
		Scanner nomeAluno = new Scanner(System.in);
		System.out.println("Por favor insira o nome do aluno: \n");
		String alunoNome = nomeAluno.next();
		aluno.setNome(alunoNome);
		
		Scanner telefoneAluno = new Scanner(System.in);
		System.out.println("Por favor insira o telefone do aluno: \n");
		String alunoTelefone = telefoneAluno.next();
		aluno.setTelefone(alunoTelefone);
		
		Scanner dataAluno = new Scanner(System.in);
		System.out.println("Por favor insira a data do aluno seguindo o seguinte modelo: \n"
				+ "ANO-MÊS-DIA --> EXEMPLO: 1996-07-23");
		String alunoData = dataAluno.next();
		LocalDate dataNascimento = LocalDate.parse(alunoData);
		aluno.setDataNascimento(dataNascimento);
		
		Scanner cpfAluno = new Scanner(System.in);
		System.out.println("Por favor insira o cpf do aluno: \n");
		String alunoCpf = cpfAluno.next();
		aluno.setCpf(alunoCpf);
		
		aluno.criarId();
		System.out.println("A ID deste aluno é: \n" +aluno.Id);
		
		aluno.condição();
		System.out.println("A condição do aluno é: "+ aluno.getCondição()+ "\n");
		
		Scanner notaAluno = new Scanner(System.in);
		System.out.println("Por favor insira a nota do aluno: \n");
		int alunoNota= notaAluno.nextInt();
		aluno.setNota(alunoNota);
		
		System.out.println("Este aluno possui: " + aluno.qtdAtendimentoAluno + "Atendimentos registrado(s)\n"
				+ "Para acrescentar atendimentos a este aluno, volte ao menu principal e inície o processo de registro de atendimento \n");
		
		pessoa.alunos.add(aluno);
		pessoas.add(aluno);
		
		System.out.println(aluno.toString());
	
	}
	
	 void addAtendimento() {
		qtdAtendimentoAluno++;
	}
	
	 
	 
}
