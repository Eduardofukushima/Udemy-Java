package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite respectivamente o codigo da peça, numero de peças e valor unitario: ");
		int cod1 = sc.nextInt();
		int und1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		System.out.println("Repita o processo para registrar o 2 item: ");
		int cod2 = sc.nextInt();
		int und2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		double total = (und1*valor1 + und2*valor2);
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
		
		sc.close();

	}

}
