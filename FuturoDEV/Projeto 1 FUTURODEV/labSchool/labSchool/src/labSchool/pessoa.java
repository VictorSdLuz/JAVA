package labSchool;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class pessoa {
	
	 String Nome;
	 String Telefone;
	 LocalDate dataNascimento;
	 String Cpf;
	public static long Id=0;
	static ArrayList<aluno> alunos= new ArrayList<aluno>();
	static ArrayList<pessoa> pessoas= new ArrayList<pessoa>();
	static ArrayList<professor> professores= new ArrayList<professor>();
	static ArrayList<pedagogo> pedagogos= new ArrayList<pedagogo>();
	
	
	


	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public static synchronized String criarId()
	{
	    return String.valueOf(Id++);
	}
	
	public String toString() {
		String myString = "Nome: "+ Nome + "\n" +"Telefone: "+ Telefone + "\n" +  "Data de nascimento: " + dataNascimento + "\n" + "CPF: " +Cpf + "\n" + "ID: " +Id + "\n";
		return myString;
	}
	
	public void cadastroAtendimentoAluno() {
		
	}


		
	
	
}
