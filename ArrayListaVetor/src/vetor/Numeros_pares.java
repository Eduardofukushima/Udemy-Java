package vetor;

import java.util.Scanner;

public class Numeros_pares {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
		tela todos os números pares, e também a quantidade de números pares.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int vetor[] = new int [n];
		
		for ( int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vetor [i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("NUMEROS PARES:");
		
		int sum =0;
		
		for ( int i=0; i<n; i++) {
			if (vetor[i]%2 == 0) {
				System.out.print(vetor[i] + "  ");
				sum = sum + 1;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + sum );
		
		
		
		sc.close();

	}

}
