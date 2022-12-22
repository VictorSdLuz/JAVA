package LabSchool;

import java.util.ArrayList;
import java.util.Scanner;

public class Operacoes {
	
	static ArrayList<Aluno> AlunosLista = new ArrayList<Aluno>();
	static ArrayList<Professor> ProfessoresLista = new ArrayList<Professor>();
	static ArrayList<Pedagogo> PedagogosLista = new ArrayList<Pedagogo>();
	
	public static void inicioOperacao(){
		Scanner scanInicioOp = new Scanner(System.in);
		System.out.println("INICIO DO SISTEMA LAB SCHOOL, BEM VINDO: \n"
				+ "------------\n"
				+ "Qual operação você deseja realizar?\n"
				+ "1- DIGITE '1' PARA: --Cadastro--\n"
				+ "2- DIGITE '2' PARA: --Relatórios--\n"
				+ "3- DIGITE '3' PARA: --Cadastrar atendimento--\n");
		int decisaoInicioOp = scanInicioOp.nextInt();
		
		switch(decisaoInicioOp) {
		
			case 1:
				System.out.println("Você optou por: 'CADASTRO', vamos seguir para o menu de cadastro agora\n");
				cadastroGeral();
				break;
			case 2:
				System.out.println("Você optou por: 'RELATORIOS', vamos seguir para o menu de relatórios agora\n");
				relatoriosGeral();
				break;
			case 3:
				System.out.println("Você optou por: 'CADASTRAR ATENDIMENTO', vamos seguir para o menu de atendimentos agora\n");
				cadastrarAtendimento();
				break;
			default:
				System.out.println("Não reconheci a opção que você entrou, tente novamente");
				inicioOperacao();
		}	
	}
	
	public static void cadastroGeral() {
		Scanner scanInicioCadastro = new Scanner(System.in);
		System.out.println("INICIO DO CADASTRO: \n"
				+ "------------\n"
				+ "Qual CADASTRO deseja realizar?\n"
				+ "1- DIGITE '1' PARA: --Cadastro de ALUNOS--\n"
				+ "2- DIGITE '2' PARA: --Cadastro de PROFESSORES--\n"
				+ "3- DIGITE '3' PARA: --Cadastro de PEDAGOGOS--\n"
				+ "4- DIGITE '4' PARA: Voltar para o menu anterior\n");
		int decisaoInicioCadastroGeral = scanInicioCadastro.nextInt();
		
		switch(decisaoInicioCadastroGeral) {
		
			case 1:
				System.out.println("Você optou por: 'CADASTRO DE ALUNOS', prosseguindo com o cadastro:\n");
				Aluno.cadastroAlunos();
				break;
			case 2:
				System.out.println("Você optou por: 'CADASTRO DE PROFESSORES', prosseguindo com o cadastro:\n");
				Professor.cadastroProfessor();
				break;
			case 3:
				System.out.println("Você optou por: 'CADASTRAR DE PEDAGOGOS', prosseguindo com o cadastro:\n");
				Pedagogo.cadastroPedagogo();
				break;
			case 4:
				System.out.println("Voltando para o menu principal");
				inicioOperacao();
			default:
				System.out.println("Não reconheci a opção que você entrou, tente novamente");
				cadastroGeral();
		}	
	}
	
	public static void relatoriosGeral() {
		Scanner scanInicioCadastro = new Scanner(System.in);
		System.out.println("INICIO DO RELATORIOS: \n"
				+ "------------\n"
				+ "Qual RELATORIO deseja acessar?\n"
				+ "1- DIGITE '1' PARA: --Relatorios de ALUNOS--\n"
				+ "2- DIGITE '2' PARA: --Relatorios de PROFESSORES--\n"
				+ "3- DIGITE '3' PARA: --Relatorios de Funcionarios--\n"
				+ "4- DIGITE '4' PARA: --Relatorios de Todos cadastrados--\n"
				+ "5- DIGITE '5' PARA: --Relatorios de ATENDIMENTOS--\n"
				+ "6- DIGITE '9' PARA: Voltar para o menu anterior\n");
		int decisaoInicioCadastroGeral = scanInicioCadastro.nextInt();
		
		switch(decisaoInicioCadastroGeral) {
		
			case 1:
				System.out.println("Você optou por: 'RELATORIOS DE ALUNOS', prosseguindo:\n");
				relatoriosAlunos();
				break;
			case 2:
				System.out.println("Você optou por: 'RELATORIO DE PROFESSORES', prosseguindo:\n");
				relatoriosProfessores();
				break;
			case 3:
				System.out.println("Você optou por: 'RELATORIOS DE FUNCIONARIOS', prosseguindo:\n");
				relatoriosFuncionarios();
				break;
			case 4:
				System.out.println("Você optou por: 'RELATORIOS DE TODOS CADASTRADOS', prosseguindo:\\n");
				relatoriosTodos();
			case 5:
				System.out.println("Você optou por: 'RELATORIOS DE ATENDIMENTOS', prosseguindo:\\n");
				relatoriosAtendimentos();
			case 9:
				System.out.println("Você optou por: 'Retornar ao menu anterior', retornando:\\n");
				inicioOperacao();
			default:
				System.out.println("Não reconheci a opção que você entrou, tente novamente");
				relatoriosGeral();
		}	
	}
	
	public static void relatoriosAlunos() {
		Scanner scanInicioRelatorioAlunos = new Scanner(System.in);
		System.out.println("INICIO DO RELATORIOS: \n"
				+ "------------\n"
				+ "Qual RELATORIO deseja acessar?\n"
				+ "1- DIGITE '1' PARA: --Relatorios de alunos ATIVOS--\n"
				+ "2- DIGITE '2' PARA: --Relatorios de alunos IRREGULARES--\n"
				+ "3- DIGITE '3' PARA: --Relatorios de alunos em ATENDIMENTO--\n"
				+ "4- DIGITE '4' PARA: --Relatorios de alunos INATIVOS--\n"
				+ "5- DIGITE '5' PARA: --Relatorios de TODOS alunos--\n"
				+ "6- DIGITE '9' PARA: Voltar para o menu anterior\n");
		int decisaoInicioRelatorioAlunos = scanInicioRelatorioAlunos.nextInt();
		
		switch(decisaoInicioRelatorioAlunos) {
		
			case 1:
				System.out.println("Você optou por: 'RELATORIOS DE ALUNOS ATIVOS', prosseguindo:\n");
				relatoriosAlunosAtivos();
				break;
			case 2:
				System.out.println("Você optou por: 'RELATORIO DE ALUNOS IRREGULARES', prosseguindo:\n");
				relatoriosAlunosIrregulares();
				break;
			case 3:
				System.out.println("Você optou por: 'RELATORIOS DE ALUNOS ATENDIMENTO', prosseguindo:\n");
				relatoriosAlunosAtendimento();
				break;
			case 4:
				System.out.println("Você optou por: 'RELATORIOS DE ALUNOS INATIVOS', prosseguindo:\\n");
				relatoriosAlunosInativos();
			case 5:
				System.out.println("Você optou por: 'RELATORIOS DE TODOS ALUNOS', prosseguindo:\\n");
				relatoriosTodosAlunos();
			case 9:
				System.out.println("Você optou por: 'Retornar ao menu anterior', retornando:\\n");
				relatoriosGeral();
			default:
				System.out.println("Não reconheci a opção que você entrou, tente novamente");
				relatoriosAlunos();
		}	
	}
	
	public static void relatoriosAlunosAtivos(){
		String condicaoRegistro; 
		for(Aluno aluno : AlunosLista) {
			 condicaoRegistro = aluno.getCondicao();
			 if(condicaoRegistro == "ATIVO") {
					System.out.println("Aluno nome: "+aluno.getNome()+" - "
							+"Aluno id: "+aluno.getId()+" - "
							+"Aluno condicao: "+aluno.getCondicao()+" - "
							+"Aluno Nota: "+aluno.getNota()+"\n"
							+"Total de atendimentos do aluno: "+aluno.totalAtendimentos);
			 }
		 }
		relatoriosAlunos();
	}

	public static void relatoriosAlunosIrregulares(){
		String condicaoRegistro; 
		for(Aluno aluno : AlunosLista) {
			 condicaoRegistro = aluno.getCondicao();
			 if(condicaoRegistro == "IRREGULAR") {
					System.out.println("Aluno nome: "+aluno.getNome()+" - "
							+"Aluno id: "+aluno.getId()+" - "
							+"Aluno condicao: "+aluno.getCondicao()+" - "
							+"Aluno Nota: "+aluno.getNota()+"\n"
							+"Total de atendimentos do aluno: "+aluno.totalAtendimentos);
			 }
		 }
		relatoriosAlunos();
	}
	
	public static void relatoriosAlunosAtendimento(){
		String condicaoRegistro; 
		for(Aluno aluno : AlunosLista) {
			 condicaoRegistro = aluno.getCondicao();
			 if(condicaoRegistro == "ATENDIMENTO") {
					System.out.println("Aluno nome: "+aluno.getNome()+" - "
							+"Aluno id: "+aluno.getId()+" - "
							+"Aluno condicao: "+aluno.getCondicao()+" - "
							+"Aluno Nota: "+aluno.getNota()+"\n"
							+"Total de atendimentos do aluno: "+aluno.totalAtendimentos);
			 }
		 }
		relatoriosAlunos();
	}
	
	public static void relatoriosAlunosInativos(){
		String condicaoRegistro; 
		for(Aluno aluno : AlunosLista) {
			 condicaoRegistro = aluno.getCondicao();
			 if(condicaoRegistro == "INATIVO") {
					System.out.println("Aluno nome: "+aluno.getNome()+" - "
							+"Aluno id: "+aluno.getId()+" - "
							+"Aluno condicao: "+aluno.getCondicao()+" - "
							+"Aluno Nota: "+aluno.getNota()+"\n"
									+ "Total de atendimentos do aluno: "+aluno.totalAtendimentos);
			 }
		 }
		relatoriosAlunos();
	}
	
	public static void relatoriosTodosAlunos(){
		String condicaoRegistro; 
		for(Aluno aluno : AlunosLista) {
			System.out.println("Aluno nome: "+aluno.getNome()+" - "
				+"Aluno id: "+aluno.getId()+" - "
				+"Aluno condicao: "+aluno.getCondicao()+" - "
				+"Aluno Nota: "+aluno.getNota()+"\n"
						+"Total de atendimentos do aluno: "+aluno.totalAtendimentos);
			 }
		relatoriosAlunos();
	}
	
	
	public static void relatoriosProfessores() {
		Scanner scanInicioRelatorioAlunos = new Scanner(System.in);
		System.out.println("INICIO DO RELATORIOS: \n"
				+ "------------\n"
				+ "Qual RELATORIO deseja acessar?\n"
				+ "1- DIGITE '1' PARA: --Relatorios de Professores FRONT-END --\n"
				+ "2- DIGITE '2' PARA: --Relatorios de Professores BACK-END --\n"
				+ "3- DIGITE '3' PARA: --Relatorios de Professores FULL-STACK --\n"
				+ "5- DIGITE '5' PARA: --Relatorios de TODOS Professores--\n"
				+ "6- DIGITE '9' PARA: Voltar para o menu anterior\n");
		int decisaoInicioRelatorioAlunos = scanInicioRelatorioAlunos.nextInt();
		
		switch(decisaoInicioRelatorioAlunos) {
		
			case 1:
				System.out.println("Você optou por: 'RELATORIOS DE Professores FRONT-END', prosseguindo:\n");
				relatoriosProfFront();
				break;
			case 2:
				System.out.println("Você optou por: 'RELATORIO DE Professores BACK-END', prosseguindo:\n");
				relatoriosProfBack();
				break;
			case 3:
				System.out.println("Você optou por: 'RELATORIOS DE Professores FULL-STACK', prosseguindo:\n");
				relatoriosProfFull();
				break;
			case 5:
				System.out.println("Você optou por: 'RELATORIOS DE TODOS PROFESSORES', prosseguindo:\\n");
				relatoriosTodosProf();
			case 9:
				System.out.println("Você optou por: 'Retornar ao menu anterior', retornando:\\n");
				relatoriosGeral();
			default:
				System.out.println("Não reconheci a opção que você entrou, tente novamente");
				relatoriosProfessores();
		}	
	}
	
	public static void relatoriosProfFront() {
		String expRegistro; 
		for(Professor professor: ProfessoresLista) {
			expRegistro = professor.getExperiencia();
			 if(expRegistro == "Front-End") {
					System.out.println("Professor nome: "+professor.getNome()+" - "
							+"Professor id: "+professor.getId()+" - "
							+"Professor experiencia: "+professor.getExperiencia());
			 }
		 }
		relatoriosProfessores();
	}
	
	public static void relatoriosProfBack() {
		String expRegistro; 
		for(Professor professor: ProfessoresLista) {
			expRegistro = professor.getExperiencia();
			 if(expRegistro == "Back-End") {
					System.out.println("Professor nome: "+professor.getNome()+" - "
							+"Professor id: "+professor.getId()+" - "
							+"Professor experiencia: "+professor.getExperiencia());
			 }
		 }
		relatoriosProfessores();
	}
	
	public static void relatoriosProfFull() {
		String expRegistro; 
		for(Professor professor: ProfessoresLista) {
			expRegistro = professor.getExperiencia();
			 if(expRegistro == "Full-Stack") {
					System.out.println("Professor nome: "+professor.getNome()+" - "
							+"Professor id: "+professor.getId()+" - "
							+"Professor experiencia: "+professor.getExperiencia());
			 }
		 }
		relatoriosProfessores();
	}
	
	public static void relatoriosTodosProf() {
		for(Professor professor: ProfessoresLista) {
					System.out.println("Professor nome: "+professor.getNome()+" - "
							+"Professor id: "+professor.getId()+" - "
							+"Professor experiencia: "+professor.getExperiencia());
		 }
		relatoriosProfessores();
	}
	
	public static void relatoriosFuncionarios() {
		System.out.println("---Relatorio de todos os funcionarios: ---");
		System.out.println("\nTodos professores cadastrados: \n");
		for(Professor professor: ProfessoresLista) {
			System.out.println("Professor nome: "+professor.getNome()+" - "
					+"Professor id: "+professor.getId()+" - "
					+"Professor experiencia: "+professor.getExperiencia());
 }
		System.out.println("\nTodos os Pedagogos");
		for(Pedagogo pedagogo: PedagogosLista) {
			System.out.println("Pedagogo nome: "+pedagogo.getNome()+" - "
					+"Pedagogo id: "+pedagogo.getId()+" - ");
		}
		System.out.println("\n---Fim de relatório---\n");
		relatoriosGeral();
	}
	
	public static void relatoriosTodos() {
		System.out.println("---Relatorio de todos cadastrados: ---");
		System.out.println("Todos professores cadastrados: ");
		for(Professor professor: ProfessoresLista) {
			System.out.println("Professor nome: "+professor.getNome()+" - "
					+"Professor id: "+professor.getId()+" - "
					+"Professor experiencia: "+professor.getExperiencia());
 }
		System.out.println("\nTodos alunos cadastrados: ");
		for(Aluno aluno : AlunosLista) {
			System.out.println("Aluno nome: "+aluno.getNome()+" - "
				+"Aluno id: "+aluno.getId()+" - "
				+"Aluno condicao: "+aluno.getCondicao()+" - "
				+"Aluno Nota: "+aluno.getNota()+"\n");
			 }
		System.out.println("\nTodos os Pedagogos");
		for(Pedagogo pedagogo: PedagogosLista) {
			System.out.println("Pedagogo nome: "+pedagogo.getNome()+" - "
					+"Pedagogo id: "+pedagogo.getId()+" - ");
		}
		System.out.println("---RELATÓRIO CONCLUÍDO---");
		relatoriosGeral();
	}
 	
	public static void cadastrarAtendimento() {
		System.out.println("Você selecionou a opção de cadastrar atendimento: \n");
		int alunoIndex = 0;
		int pedagogoIndex = 0;
		
		if(AlunosLista.size()<1 && PedagogosLista.size()<1) {
			System.out.println("Para seguir com o cadastro de atendimento, é necessario ter ao menos um Pedagogo e um aluno cadastrados, volte quando eles estiverem no sistema por favor.\n");
			inicioOperacao();
		}
		Scanner cpfAlunoScan = new Scanner(System.in);
		System.out.println("Digite o Cpf do aluno que você deseja cadastrar um atendimento: \n");
		int cpfAluno = cpfAlunoScan.nextInt();
		for(Aluno alunoI : AlunosLista) {
			if(cpfAluno == alunoI.getCpf()) {
				alunoIndex = AlunosLista.indexOf(alunoI);
			}else {
				alunoIndex = -1;
			}
		}

		System.out.println("Aluno indice: "+alunoIndex);
		
		Scanner cpfPedagogoScan = new Scanner(System.in);
		System.out.println("Digite o Cpf do pedagogo que você deseja cadastrar um atendimento: \n");
		int cpfPedagogo = cpfPedagogoScan.nextInt();
		for(Pedagogo pedagogoI : PedagogosLista) {
			if(cpfPedagogo == pedagogoI.getCpf()) {
				pedagogoIndex = PedagogosLista.indexOf(pedagogoI);
			}else {
				pedagogoIndex = -1;
			}
		}
		System.out.println("indice pedagogo: "+pedagogoIndex);
		
		if(alunoIndex < 0) {
			System.out.println("O nome do aluno que você inseriu esta errado ou não existe no sistema, volte para o menu anterior por favor: \n");
			inicioOperacao();
		}else {
			AlunosLista.get(alunoIndex).totalAtendimentos+=1;
			System.out.println("Atendimento cadastrado com sucesso");
			System.out.println("\n Total de atendimentos do aluno "+AlunosLista.get(alunoIndex).getNome()+" é de: "+AlunosLista.get(alunoIndex).totalAtendimentos);
		}
		
		if(pedagogoIndex < 0) {
			System.out.println("O nome do pedagogo que você inseriu esta errado ou não existe no sistema, volte para o menu anterior por favor: \n");
			inicioOperacao();
		}else {
			PedagogosLista.get(pedagogoIndex).totalAtendimentos+=1;
			System.out.println("Atendimento cadastrado com sucesso");
			System.out.println("\n Total de atendimentos do Pedagogo "+PedagogosLista.get(pedagogoIndex).getNome()+" é de: "+PedagogosLista.get(pedagogoIndex).totalAtendimentos);
		}
		System.out.println("Atendimentos cadastrados com sucesso, voltando para o menu principal");
		inicioOperacao();
	}
	
	public static void relatoriosAtendimentos() {
		
		if(AlunosLista.size()<1 && PedagogosLista.size()<1) {
			System.out.println("Nao há alunos ou pedagogos cadastrados, voltando ao menu principal");
			inicioOperacao();
		}
		int alunoIndex=0;
		int pedagogoIndex=0;
		int maxAluno=0;
		int maxPedagogo=0;
		
		for(int i=0; i<AlunosLista.size(); i++) {
			if(AlunosLista.get(i).totalAtendimentos>maxAluno) {
				alunoIndex=i;
				maxAluno= AlunosLista.get(i).totalAtendimentos;
			}
		}
		
		for(int i=0; i<PedagogosLista.size(); i++) {
			if(PedagogosLista.get(i).totalAtendimentos>maxPedagogo) {
				pedagogoIndex=i;
				maxPedagogo= PedagogosLista.get(i).totalAtendimentos;
			}
		}
		System.out.println("teste aluno index="+alunoIndex+
				"\nteste pedagogo index="+pedagogoIndex);
		System.out.println("O aluno com mais atendimentos é: "+AlunosLista.get(alunoIndex).getNome()
				+" com "+AlunosLista.get(alunoIndex).totalAtendimentos+" atendimentos"
						+ "\n O pedagogo com mais atendimentos é: "+PedagogosLista.get(pedagogoIndex).getNome()
						+" com "+PedagogosLista.get(pedagogoIndex).totalAtendimentos+" atendimentos");
	}
	
	
	
}