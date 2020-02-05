package aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

import entidade.Conta;
import model.excecoes.DomainExcecoes;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		try {
		System.out.println("Informe os dados da conta ");
		System.out.print("Número: ");
		Integer numero = leia.nextInt();
		leia.nextLine();
		System.out.print("Titular: ");
		String titular = leia.nextLine();
		System.out.print("Saldo Inicial: ");
		Double saldo = leia.nextDouble();
		System.out.print("Informe o limite de saque: ");
		Double limiteSaque = leia.nextDouble();
		Conta conta = new Conta(numero, titular, saldo, limiteSaque);
		
		System.out.println();
		
		
		System.out.print("Informe o valor do saque: ");
		Double saque = leia.nextDouble();
		conta.saque(saque);
		System.out.println("Saldo da conta: "+conta.getSaldo());
		}
		catch(DomainExcecoes x) {
			System.out.println("Erro no saque: "+x.getMessage());
		}
		catch(InputMismatchException x) {
			System.out.println("Erro: Caracteres não aceitos!");
		}
	}

}
