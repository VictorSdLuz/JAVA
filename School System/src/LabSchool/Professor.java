package LabSchool;

import java.time.LocalDate;
import java.util.Scanner;

public class Professor extends Pessoa{

	String formacao;
	String Experiencia;
	String atividade;

	
	public Professor(String nome, String telefone, LocalDate dataNascimento, int cpf, int id, String formacao,
			String experiencia, String atividade) {
		super(nome, telefone, dataNascimento, cpf, id);
		this.formacao = formacao;
		Experiencia = experiencia;
		this.atividade = atividade;
		gerarId();
		this.id = idGerador;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public String getExperiencia() {
		return Experiencia;
	}

	public void setExperiencia(String experiencia) {
		Experiencia = experiencia;
	}

	public String getAtividade() {
		return atividade;
	}

	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}
	
	public static void cadastroProfessor() {
		System.out.println("começando cadastro do professor\n");
		Scanner nomeScan = new Scanner(System.in);
		System.out.println("Digite o nome do Professor:\n");
		String nomeCadastro = nomeScan.next();
		
		Scanner telefoneScan = new Scanner(System.in);
		System.out.println("Digite o telefone do Professor:\n");
		String telefoneCadastro = telefoneScan.next();
		
		Scanner dataScan = new Scanner(System.in);
		System.out.println("Por favor insira a data do Professor seguindo o seguinte modelo: \n"
				+ "ANO-MÊS-DIA --> EXEMPLO: 1996-07-23");
		String dataCadastro = dataScan.next();
		LocalDate dataNascimento = LocalDate.parse(dataCadastro);
		
		Scanner cpfScan = new Scanner(System.in);
		System.out.println("Digite o cpf do Professor:\n");
		int cpfCadastro = cpfScan.nextInt();
		
		int idProfessor = gerarId();
		
		Scanner formacaoScan = new Scanner(System.in);
		System.out.println("Qual a formacao do Professor?\n"
				+ "1- DIGITE '1' PARA: -Graudação completaod--\n"
				+ "2- DIGITE '2' PARA: --Graduacao Incompleta--\n"
				+ "3- DIGITE '3' PARA: --Mestrado--\n"
				+ "3- DIGITE '4' PARA: Doutorado--\n");
		int formacaoProfInt = formacaoScan.nextInt();
		String formacaoProfessor ="";
		switch(formacaoProfInt) {
			case 1:
				System.out.println("Você optou por: 'Graudação completa', seguindo com o cadastro\n");
				formacaoProfessor = "Graudacao completao";
				break;
			case 2:
				System.out.println("Você optou por: 'Graduacao Incompleta', seguindo com o cadastro\n");
				formacaoProfessor = "Graduacao Incompleta";
				break;
			case 3:
				System.out.println("Você optou por: 'Mestrado', seguindo com o cadastro\n");
				formacaoProfessor = "Mestrado";
				break;
			case 4:
				System.out.println("Você optou por: 'Doutorado', seguindo com o cadastro\n");
				formacaoProfessor = "Doutorado";
				break;
			default:
				System.out.println("Não reconheci a opção que você entrou, tente novamente");
		}
		
		Scanner experienciaScan = new Scanner(System.in);
		System.out.println("Qual a formacao do Professor?\n"
				+ "1- DIGITE '1' PARA: --Front-End--\n"
				+ "2- DIGITE '2' PARA: --Back-End--\n"
				+ "3- DIGITE '3' PARA: --Full-Stack--\n");
		int expProfInt = experienciaScan.nextInt();
		String xpProf ="";
		switch(expProfInt) {
			case 1:
				System.out.println("Você optou por: 'Front-End', seguindo com o cadastro\n");
				xpProf = "Front-End";
				break;
			case 2:
				System.out.println("Você optou por: 'Back-End', seguindo com o cadastro\n");
				xpProf = "Back-End";
				break;
			case 3:
				System.out.println("Você optou por: 'Full-Stack', seguindo com o cadastro\n");
				xpProf = "Full-Stack";
				break;
			default:
				System.out.println("Não reconheci a opção que você entrou, tente novamente");
		}
		
		Scanner atividadeScan = new Scanner(System.in);
		System.out.println("Qual a formacao do Professor?\n"
				+ "1- DIGITE '1' PARA: --Ativo--\n"
				+ "2- DIGITE '2' PARA: --Inativo--\n");
		int atividadeProfInt = atividadeScan.nextInt();
		String atividadeProf ="";
		switch(atividadeProfInt) {
			case 1:
				System.out.println("Você optou por: 'Ativo', seguindo com o cadastro\n");
				atividadeProf = "Ativo";
				break;
			case 2:
				System.out.println("Você optou por: 'Inativo', seguindo com o cadastro\n");
				atividadeProf = "Inativo";
				break;
			default:
				System.out.println("Não reconheci a opção que você entrou, tente novamente");
		}
		
		Professor professor = new Professor(nomeCadastro, telefoneCadastro, dataNascimento, cpfCadastro, idProfessor, formacaoProfessor, xpProf, atividadeProf);
		Operacoes.ProfessoresLista.add(professor);
		System.out.println("Professor nome: "+professor.getNome()+"\n"
		+"Professor telefone: "+professor.getTelefone()+"\n"
		+"Professor data de nascimento: "+professor.getDataNascimento()+"\n"
		+"Professor cpf: "+professor.getCpf()+"\n"
		+"Professor id: "+professor.getId()+"\n"
		+"Professor condicao: "+professor.getFormacao()+"\n"
		+"Professor Nota: "+professor.getExperiencia()+"\n"
		+"Professor Nota: "+professor.getAtividade()+"\n"
				);
		System.out.println("Professor cadastrado com sucesso");
		Operacoes.inicioOperacao();
	}
	
}
