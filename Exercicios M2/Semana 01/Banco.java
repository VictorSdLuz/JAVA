package m02s01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Banco{

		List<Conta> contas = new ArrayList<>();

		public List<Conta> getContas() {
			return contas;
		}

		public void setContas(List<Conta> contas) {
			this.contas = contas;
		}
		
		Conta achaConta(String numeroConta) {
			for(Conta conta : this.contas) {
				if(conta.getConta().equals(numeroConta)) {
					// Conta existe
					return conta;
				}
			}
			
			return null;
		}
		
		boolean transferencia(String numContaOrigem, String numContaDestino,
				double valor) {
			
			// Verifica se a conta de origem existe;
			Conta contaOrigem = achaConta(numContaOrigem);
			// Verifica se a conta de destino existe;
			Conta contaDestino = achaConta(numContaDestino);
			
			
			if (contaOrigem == null) {
				System.out.println("Conta de origem não existe!");
				return false;
			}
			
			if (contaDestino == null) {
				System.out.println("Conta de destino não existe!");
				return false;			
			}
			
			if (contaOrigem.getSaldo() < valor) {
				System.out.println("Conta de origem não possui saldo suficiente!");
				return false;				
			}
			
			contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
			contaDestino.setSaldo(contaDestino.getSaldo() + valor);
			return true;
		}
		
		public static void main(String[] args) {
			
			Banco pinheiraMoney = new Banco();
			
			Conta conta1 = new Conta();
			conta1.setConta("111");
			conta1.setSaldo(150);
			
			Conta conta2 = new Conta();
			conta2.setConta("222");
			conta2.setSaldo(1500);
			
			Conta conta3 = new Conta();
			conta3.setConta("333");
			conta3.setSaldo(800);
			
			Conta conta4 = new Conta();
			conta4.setConta("444");
			conta4.setSaldo(8000);
			
			Conta conta5 = new Conta();
			conta5.setConta("555");
			conta5.setSaldo(10000);

			pinheiraMoney.getContas().add(conta1);
			pinheiraMoney.getContas().add(conta2);
			pinheiraMoney.getContas().add(conta3);
			pinheiraMoney.getContas().add(conta4);
			pinheiraMoney.getContas().add(conta5);
			
			
			System.out.println(pinheiraMoney
					.transferencia("111", "222", 50));
			
			System.out.println(pinheiraMoney
					.transferencia("333", "222", 1000));
			
			System.out.println(pinheiraMoney
					.transferencia("222", "777", 50));
			
			System.out.println(
					pinheiraMoney.achaConta("111").getSaldo());
			System.out.println(
					pinheiraMoney.achaConta("222").getSaldo());
			System.out.println(
					pinheiraMoney.achaConta("333").getSaldo());
		}
			

	}


