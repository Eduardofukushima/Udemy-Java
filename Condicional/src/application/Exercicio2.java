package application;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		 */
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int n = sc.nextInt();
		
		if (n%2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
		
		sc.close();

	}

}
