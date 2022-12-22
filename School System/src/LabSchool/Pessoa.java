package LabSchool;

import java.time.LocalDate;

public abstract class  Pessoa{
	String nome;
	String telefone;
	LocalDate dataNascimento;
	int cpf;
	static int idGerador;
	int id;
	
	public Pessoa(String nome, String telefone, LocalDate dataNascimento, int cpf, int id) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public static int gerarId() {
		idGerador++;
		return idGerador;
	}
}
