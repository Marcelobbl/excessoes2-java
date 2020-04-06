package aplication;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import model.entities.DominioExcessao;


public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite os dados da conta");
			System.out.print("Numero: ");
			int numero = sc.nextInt();
			System.out.println("Nome: ");
			sc.next();
			String nome = sc.nextLine();
			System.out.print("Deposito inicial: ");
			Double depositoInicial = sc.nextDouble();
			System.out.print("Limite de saque: ");
			Double limiteSaque = sc.nextDouble();
			
			Conta conta = new Conta(numero, nome, depositoInicial, limiteSaque);
			System.out.print("Entre com o valor de saque: ");
			Double valorSaque = sc.nextDouble();
			conta.saque(valorSaque);
			System.out.println(conta);
		}
		catch (DominioExcessao e) {
			System.out.println("Erro no saque! " + e.getMessage());
			
		}
		catch (InputMismatchException e) {
			System.out.println("Erro inesperado");
		}
		
		
		sc.close();
	}
}
