package labSchool;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pedagogo extends pessoa{
	
	int qtdAtendimentoPedagogo=0;

	public int getQtdAtendimentoPedagogo() {
		return qtdAtendimentoPedagogo;
	}

	public void setQtdAtendimentoPedagogo(int qtdAtendimentoPedagogo) {
		this.qtdAtendimentoPedagogo = qtdAtendimentoPedagogo;
	}
	
	public String toString() {
		String myString = "DADOS DO NOVO PEDAGOGO: \n" +"Nome: "+ Nome + "\n" +"Telefone: "+ Telefone + "\n" +  "Data de nascimento: " + dataNascimento + "\n" + "CPF: " +Cpf + "\n"  
				+ "ID: " +Id + "\n" + "Quantidade de atendimentos: " + qtdAtendimentoPedagogo;
		return myString;
	}
	
	static void cadastro() {
		System.out.println("Vamos começar:");
		pedagogo pedagogo = new pedagogo();	
		
		Scanner nomePedagogo = new Scanner(System.in);
		System.out.println("Por favor insira o nome do pedagogo: \n");
		String PedagogoNome = nomePedagogo.next();
		pedagogo.setNome(PedagogoNome);
		
		Scanner telefonePedagogo = new Scanner(System.in);
		System.out.println("Por favor insira o telefone do pedagogo: \n");
		String pedagogooTelefone = telefonePedagogo.next();
		pedagogo.setNome(pedagogooTelefone);
		
		Scanner dataPedagogo = new Scanner(System.in);
		System.out.println("Por favor insira a data do pedagogo seguindo o seguinte modelo: \n"
				+ "ANO-MÊS-DIA --> EXEMPLO: 1996-07-23");
		String pedagogoData = dataPedagogo.next();
		LocalDate dataNascimento = LocalDate.parse(pedagogoData);
		pedagogo.setDataNascimento(dataNascimento);
		
		Scanner cpfPedagogo = new Scanner(System.in);
		System.out.println("Por favor insira o cpf do pedagogo: \n");
		String pedagogoCpf = cpfPedagogo.next();
		pedagogo.setCpf(pedagogoCpf);
		
		pedagogo.criarId();
		System.out.println("A ID deste pedagogo é: \n" +pedagogo.Id);
		
		System.out.println("Este pedagogo possui: " + pedagogo.qtdAtendimentoPedagogo + "Atendimentos registrado(s) \n"
				+ "\n Para acrescentar atendimentos a este pedagogo, volte ao menu principal e inície o processo de registro de atendimento \n");
		
		pessoa.pedagogos.add(pedagogo);
		pessoas.add(pedagogo);
		
		pedagogo.toString();
				
	}
	
	void addAtendimento() {
		qtdAtendimentoPedagogo++;
	}
	
}
