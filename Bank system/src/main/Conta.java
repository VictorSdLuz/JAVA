package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Conta{

	String acNumber;
	Double balance;
	Conta conta;
	
	public static ArrayList<Conta> Contas = new ArrayList<Conta>();
	
	public String getAcNumber() {
		return acNumber;
	}
	public void setAcNumber(String acNumber) {
		this.acNumber = acNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	public static void printContas(Conta conta1, Conta conta2) {
		System.out.println("--CONTA 1--\n"
				+ "SALDO conta 1: R$:"+conta1.getBalance()+"\n"
				+ "NUMERO DA CONTA1: "+conta1.getAcNumber()+"\n"
				+ "--CONTA 2 --\n"
						+ "SALDO conta 2: R$:"+conta2.getBalance()+"\n"
						+ "NUMERO DA CONTA 2: "+conta2.getAcNumber()+"\n");
	}
	

	
	Conta(String acNumber, Double balance){
		this.acNumber = acNumber;
		this.balance = balance;
	}
	
	public static void criarConta1(){
		Scanner contaNumeroScan = new Scanner(System.in);
		System.out.println("Qual o numero da primeira conta? ");
		String contaNumero = contaNumeroScan.next();
		
		Scanner saldoContaScan = new Scanner(System.in);
		System.out.println("Qual o saldo da primeira conta? \n(digite apenas os números, usando ',' como separador entre reais e centavos)");
		Double saldoConta= saldoContaScan.nextDouble();
		
		Conta conta = new Conta(contaNumero, saldoConta);
		Contas.add(0, conta);
		
		System.out.println("primeira conta criada com sucesso");
	}
	
	public static void criarConta2(){
		Scanner contaNumeroScan = new Scanner(System.in);
		System.out.println("Qual o numero da segunda conta? ");
		String contaNumero = contaNumeroScan.next();
		
		Scanner saldoContaScan = new Scanner(System.in);
		System.out.println("Qual o saldo da segunda conta? \n(digite apenas os números, usando ',' como separador entre reais e centavos)");
		Double saldoConta= saldoContaScan.nextDouble();
		
		Conta conta = new Conta(contaNumero, saldoConta);
		Contas.add(1, conta);
		
		System.out.println("segunda conta criada com sucesso");
	}
	
	
	
}
