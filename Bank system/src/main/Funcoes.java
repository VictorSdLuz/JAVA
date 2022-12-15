package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Funcoes{
	
	String contaAcesso;
	
	static public void operacao() {
		
		Scanner opcao1Scan = new Scanner(System.in);
		System.out.println("Bem vindo ao banco Luz"
				+ "\nDIGITE 1 PARA: Adicionar contas"
				+ "\nDIGITE 2 PARA: Transferencia"
				+ "\nDIGITE 3 PARA: Consulta de contas"
				+ "\nDIGITE 4 PARA: Finalizar operação");
		
		String opcao = opcao1Scan.next();
		switch(opcao) {
		case "1":
			criarConta();
			operacao();
			break;
			
		case "2":
			transf();
			operacao();
			
		case "3":
			consultarContas();
			operacao();
			
		case "4":
			System.out.println("Finalizando operações");
			break;
			
		default:
			System.out.println("Input errado, tente novamente.");
			operacao();
		}
	}
	
	public static boolean transf() {
		int index1=0;
		int index2 = 0;
		
		Scanner numeroConta1Scan = new Scanner(System.in);
		System.out.println("Insira o numero da conta que desejar retirar o valor: \n");
		String numeroConta1 = numeroConta1Scan.next();
		
		Scanner numeroConta2Scan = new Scanner(System.in);
		System.out.println("Insira o numero da conta que desejar enviar o valor: \n");
		String numeroConta2 = numeroConta2Scan.next();
		
		for(int i=0; i<Conta.Contas.size();i++) {			
			if(numeroConta1.equals(Conta.Contas.get(i).acNumber)) {
				index1= i;
			}
		}
		for(int i=0; i<Conta.Contas.size();i++) {			
			if(numeroConta2.equals(Conta.Contas.get(i).acNumber)) {
				index2= i;
			}
		}
		
		
		if( (numeroConta1.equals(Conta.Contas.get(index1).getAcNumber())) && (numeroConta2.equals(Conta.Contas.get(index2).getAcNumber())) )  {
			System.out.println("Numeros identificadores corretos, prosseguindo: ");

		}else{
			System.out.println("Numeros identificadores errados");
			return false;
		}
		
		
		Scanner valorTransfScan = new Scanner(System.in);
		System.out.println("Insira o numero da conta que desejar enviar o valor: \n");
		Double valorTransf = valorTransfScan.nextDouble();
		Double restoSaldo;
		
		if(valorTransf < Conta.Contas.get(0).getBalance()) {
			restoSaldo = (Conta.Contas.get(0).getBalance() - valorTransf);
			Conta.Contas.get(0).setBalance(restoSaldo);
			System.out.println("Transferencia feita com sucesso, o saldo da conta agora é de: R$:"+Conta.Contas.get(0).getBalance());
		}else {
			System.out.println("Valor solicitado não bate com o valor do saldo");
			return false;
		}
		return true;
		
	}
	
	static public void criarConta(){
		System.out.println("Vamos adicionar as duas contas: \n");
		Conta.criarConta1();
		Conta.criarConta2();
		Conta.printContas(Conta.Contas.get(0), Conta.Contas.get(1));
	}
	
	static public void consultarContas(){
		Scanner numeroContaScan = new Scanner(System.in);
		System.out.println("Digite o número da conta que deseja verificar: \n");
		String contaAcesso = numeroContaScan.next();
			
		
		
			for(int i=0; i<Conta.Contas.size();i++) {			
				if(contaAcesso.equals(Conta.Contas.get(i).acNumber)) {
					System.out.println("Numero da conta: "+Conta.Contas.get(i).getAcNumber()
							+"\nSaldo da conta: "+Conta.Contas.get(i).getBalance()+"\n"
									+ "Voltando para o menu principal \n");
					operacao();
				}
			System.out.println("Numero incompativel com banco de dados, conta não existe ou número errado. \n"
					+"Voltando ao menu principal \n");
			operacao();
			
			}

	}
	
}
	

