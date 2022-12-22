package LabSchool;

import java.time.LocalDate;
import java.util.Scanner;

public class Pedagogo extends Pessoa{
	
	int totalAtendimentos=0;

	public Pedagogo(String nome, String telefone, LocalDate dataNascimento, int cpf, int id) {
		super(nome, telefone, dataNascimento, cpf, id);
//		this.totalAtendimentos = totalAtendimentos;
		gerarId();
		this.id = idGerador;
	}

	public int getTotalAtendimentos() {
		return totalAtendimentos;
	}

	public void setTotalAtendimentos(int totalAtendimentos) {
		this.totalAtendimentos = totalAtendimentos;
	}
	
	public static void cadastroPedagogo() {
		System.out.println("começando cadastro do Pedagogo\n");
		Scanner nomeScan = new Scanner(System.in);
		System.out.println("Digite o nome do Pedagogo:\n");
		String nomeCadastro = nomeScan.next();
		
		Scanner telefoneScan = new Scanner(System.in);
		System.out.println("Digite o telefone do Pedagogo:\n");
		String telefoneCadastro = telefoneScan.next();
		
		Scanner dataScan = new Scanner(System.in);
		System.out.println("Por favor insira a data do Pedagogo seguindo o seguinte modelo: \n"
				+ "ANO-MÊS-DIA --> EXEMPLO: 1996-07-23");
		String dataCadastro = dataScan.next();
		LocalDate dataNascimento = LocalDate.parse(dataCadastro);
		
		Scanner cpfScan = new Scanner(System.in);
		System.out.println("Digite o cpf do Pedagogo:\n");
		int cpfCadastro = cpfScan.nextInt();
		
		int idPedagogo = gerarId();
		
		Pedagogo pedagogo = new Pedagogo(nomeCadastro, telefoneCadastro, dataNascimento, cpfCadastro, idPedagogo);
		Operacoes.PedagogosLista.add(pedagogo);
		System.out.println("Pedagogo nome: "+pedagogo.getNome()+"\n"
		+"Pedagogo telefone: "+pedagogo.getTelefone()+"\n"
		+"Pedagogo data de nascimento: "+pedagogo.getDataNascimento()+"\n"
		+"Pedagogo cpf: "+pedagogo.getCpf()+"\n"
		+"Pedagogo id: "+pedagogo.getId()+"\n"
				);
		System.out.println("Pedagogo cadastrado com sucesso");
		Operacoes.inicioOperacao();
	}
}
