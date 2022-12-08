package labSchool;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class professor extends pessoa{
	
	static String Experiencia;
	static String Estado;
	
	
	public String getExperiencia() {
		return Experiencia;
	}
	public static void setExperiencia(String experiencia) {
		Experiencia = experiencia;
	}
	public String getEstado() {
		return Estado;
	}
	public static void setEstado(String estado) {
		Estado = estado;
	}
	
	void estado() {
	
	Scanner estadoScanner = new Scanner(System.in);
	System.out.println("Assinale o estado do professor: \n"
			+ "\n"
			+ "Digite 1 para ATIVO \n"
			+ "Digite 2 para INATIVO \n");
	int respostaEstado = estadoScanner.nextInt();
	
	switch(respostaEstado) {
	
		case 1:
			Scanner segundaAcaoScan = new Scanner(System.in);
			System.out.println("Você selecionou Ativo \n");				
			professor.setEstado("Ativo");
			break;
		
		case 2:
			System.out.println("Você selecionou Inativo \n");
			professor.setEstado("Inativo");
			break;
			
		default: estado(); break;	
		}
	}
	
	void xp() {
		
		Scanner xpScanner = new Scanner(System.in);
		System.out.println("Assinale a experiencia do professor: \n"
			+ "\n"
			+ "Digite 1 para FrontEnd \n"
			+ "Digite 2 para BackEnd \n"
			+ "Digite 3 para FullStack \n");
	
		int respostaXp = xpScanner.nextInt();
	
		switch(respostaXp) {
		
		case 1:
			Scanner segundaAcaoScan = new Scanner(System.in);
			System.out.println("Você selecionou FrontEnd \n");				
			professor.setExperiencia("Front-End");
			break;
		
		case 2:
			System.out.println("Você selecionou Back-End \n");
			professor.setExperiencia("Back-End");
			break;
	
		case 3:
			System.out.println("Você selecionou Full-Stack \n");
			professor.setExperiencia("Full-Stack");
			break;
			
		default: estado(); break;	
		}
	}
	
	public String toString() {
		String myString = "DADOS DO NOVO ALUNO: \n" + "Nome: "+ Nome + "\n" +"Telefone: "+ Telefone + "\n" +  "Data de nascimento: " + dataNascimento + "\n" + "CPF: " +Cpf + "\n" 
				+ "ID: " +Id + "\n" + "Experiencia: " + Experiencia+ "\n"+ "Estado: " +Estado;
		return myString;
	}
	
	static void cadastro() {
		System.out.println("Vamos começar o cadastro do novo professor  \n");
		professor professor = new professor();	
		
		Scanner nomeProfessor = new Scanner(System.in);
		System.out.println("Por favor insira o nome do professor: \n");
		String professorNome = nomeProfessor.next();
		professor.setNome(professorNome);
		
		Scanner telefoneProfessor = new Scanner(System.in);
		System.out.println("Por favor insira o telefone do professor: \n");
		String professorTelefone = telefoneProfessor.next();
		professor.setNome(professorTelefone);
		
		Scanner dataProfessor = new Scanner(System.in);
		System.out.println("Por favor insira a data do professor seguindo o seguinte modelo: \n"
				+ "ANO-MÊS-DIA --> EXEMPLO: 1996-07-23");
		String professorData = dataProfessor.next();
		LocalDate dataNascimento = LocalDate.parse(professorData);
		professor.setDataNascimento(dataNascimento);
		
		Scanner cpfProfessor = new Scanner(System.in);
		System.out.println("Por favor insira o cpf do professor: \n");
		String professorCpf = cpfProfessor.next();
		professor.setCpf(professorCpf);
		
		professor.criarId();
		System.out.println("A ID deste professor é: \n" +aluno.Id);
		
		professor.xp();
		System.out.println("A Experiencia do PROFESSOR é: "+ professor.getExperiencia()+ "\n");
		
		professor.estado();
		System.out.println("o Estado do PROFESSOR é: "+ professor.getEstado()+ "\n");
		
		pessoa.professores.add(professor);
		pessoas.add(professor);
		
		System.out.println(professor.toString());
	
	}
	
}
