package vetor;

import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
		e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		for (int i=0; i<n; i++) {
			if (vetor[i]<0) {
				System.out.println(vetor[i]);
			}
		}
		
		
		sc.close();

	}

}
