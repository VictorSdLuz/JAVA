package LabSchool;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Aluno extends Pessoa{
	String condicao;
	int nota;
	int totalAtendimentos=0;

	
	public Aluno(String nome, String telefone, LocalDate dataNascimento, int cpf,int id, String condicao, int nota) {
		super(nome, telefone, dataNascimento, cpf, id);
		this.condicao = condicao;
		this.nota = nota;
	}
	public String getCondicao() {
		return condicao;
	}
	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	public static void cadastroAlunos() {
		System.out.println("começando cadastro do aluno\n");
		Scanner nomeScan = new Scanner(System.in);
		System.out.println("Digite o nome do Aluno:\n");
		String nomeCadastro = nomeScan.next();
		
		Scanner telefoneScan = new Scanner(System.in);
		System.out.println("Digite o telefone do Aluno:\n");
		String telefoneCadastro = telefoneScan.next();
		
		Scanner dataScan = new Scanner(System.in);
		System.out.println("Por favor insira a data do aluno seguindo o seguinte modelo: \n"
				+ "ANO-MÊS-DIA --> EXEMPLO: 1996-07-23");
		String dataCadastro = dataScan.next();
		LocalDate dataNascimento = LocalDate.parse(dataCadastro);
		
		Scanner cpfScan = new Scanner(System.in);
		System.out.println("Digite o cpf do Aluno:\n");
		int cpfCadastro = cpfScan.nextInt();
		
		int idAluno = gerarId();
		
		Scanner condicaoScan = new Scanner(System.in);
		System.out.println("Qual a condição do aluno?\n"
				+ "1- DIGITE '1' PARA: --ATIVO--\n"
				+ "2- DIGITE '2' PARA: --IRREGULAR--\n"
				+ "3- DIGITE '3' PARA: --ATENDIMENTO PEDAGÓGICO--\n"
				+ "3- DIGITE '4' PARA: --INATIVO--\n");
		int condicaoAlunoInt = condicaoScan.nextInt();
		String condicaoAluno ="";
		switch(condicaoAlunoInt) {
			case 1:
				System.out.println("Você optou por: 'ATIVO', seguindo com o cadastro\n");
				condicaoAluno = "ATIVO";
				break;
			case 2:
				System.out.println("Você optou por: 'IRREGULAR', seguindo com o cadastro\n");
				condicaoAluno = "IRREGULAR";
				break;
			case 3:
				System.out.println("Você optou por: 'ATENDIMENTO PEDAGÓGICO', seguindo com o cadastro\n");
				condicaoAluno = "ATENDIMENTO PEDAGOGICO";
				break;
			case 4:
				System.out.println("Você optou por: 'IRREGULAR', seguindo com o cadastro\n");
				condicaoAluno = "IRREGULAR";
				break;
			default:
				System.out.println("Não reconheci a opção que você entrou, tente novamente");
		}
//		NOTA		
		int notaFinal;
		do {
			Scanner notaScan = new Scanner(System.in);
			System.out.println("\nInsira a nota do aluno: ");
			int notaPerguntada = notaScan.nextInt();
			if(notaPerguntada<0) {
			System.out.println("Nota invalida, nota não pode ser menor que 0");
			}else if(notaPerguntada>10){
			System.out.println("Nota não pode ser maior que 10");
			}
			
			notaFinal = notaPerguntada;
		}while(notaFinal<0 && notaFinal>10);
		
		
		Aluno aluno = new Aluno(nomeCadastro, telefoneCadastro, dataNascimento, cpfCadastro, idAluno, condicaoAluno, notaFinal);
		Operacoes.AlunosLista.add(aluno);
		System.out.println("Aluno nome: "+aluno.getNome()+"\n"
		+"Aluno telefone: "+aluno.getTelefone()+"\n"
		+"Aluno data de nascimento: "+aluno.getDataNascimento()+"\n"
		+"Aluno cpf: "+aluno.getCpf()+"\n"
		+"Aluno id: "+aluno.getId()+"\n"
		+"Aluno condicao: "+aluno.getCondicao()+"\n"
		+"Aluno Nota: "+aluno.getNota()+"\n"
				);
		System.out.println("Aluno cadastrado com sucesso");
		Operacoes.inicioOperacao();
		
//		faltaatendimento
	}
	

	
	
	
	
//	public String condicaoAluno() {
//		Scanner condicaoScan = new Scanner(System.in);
//		System.out.println("Qual a condição do aluno?\n"
//				+ "1- DIGITE '1' PARA: --ATIVO--\n"
//				+ "2- DIGITE '2' PARA: --IRREGULAR--\n"
//				+ "3- DIGITE '3' PARA: --ATENDIMENTO PEDAGÓGICO--\n"
//				+ "3- DIGITE '4' PARA: --INATIVO--\n");
//		int condicaoAluno = condicaoScan.nextInt();
//		
//		switch(condicaoAluno) {
//			case 1:
//				System.out.println("Você optou por: 'ATIVO', seguindo com o cadastro\n");
//				condicao = "ATIVO";
//				return condicao;
//			case 2:
//				System.out.println("Você optou por: 'IRREGULAR', seguindo com o cadastro\n");
//				condicao = "IRREGULAR";
//				return condicao;
//			case 3:
//				System.out.println("Você optou por: 'ATENDIMENTO PEDAGÓGICO', seguindo com o cadastro\n");
//				condicao = "ATENDIMENTO PEDAGOGICO";
//				return condicao;
//			case 4:
//				System.out.println("Você optou por: 'IRREGULAR', seguindo com o cadastro\n");
//				condicao = "IRREGULAR";
//				return condicao;
//			default:
//				System.out.println("Não reconheci a opção que você entrou, tente novamente");
//				condicaoAluno();
//		}
//		return condicao;
//	}
	
//	public double perguntarNotaAluno() {
//		Scanner notaScan = new Scanner(System.in);
//		System.out.println("\nInsira a nota do aluno: "
//				+ "\n(lembre de usar ponto '.' caso seja uma nota decimal)\n");
//		double notaPerguntada = notaScan.nextDouble();
//		if(notaPerguntada<0) {
//			System.out.println("Nota invalida, nota não pode ser menor que 0");
//			perguntarNotaAluno();
//		}else if(notaPerguntada>10){
//			System.out.println("Nota não pode ser maior que 10");
//			perguntarNotaAluno();
//		}
//		return notaPerguntada;
//	}

	
}
