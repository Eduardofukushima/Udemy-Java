package vetor;

import java.util.Locale;
import java.util.Scanner;

public class Abaixo_da_media {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
		mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
		os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double soma = 0;
		
		double vetor [] = new double [n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			soma = soma + vetor[i];
		}
		System.out.println();
		double media = soma/n;
		System.out.printf("MEDIA DO VETOR = %.3f\n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		
		for (int i=0; i<n; i++) {
			if (vetor[i]<media) {
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();

	}

}
