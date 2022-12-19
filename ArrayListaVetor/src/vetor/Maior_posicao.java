package vetor;

import java.util.Locale;
import java.util.Scanner;

public class Maior_posicao {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
		o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
		considerando a primeira posição como 0 (zero).
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Quantos numeros deseja digitar? ");
		int n = sc.nextInt();
		
		double vetor[] = new double [n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite o " + (i+1) + " numero: ");
			vetor[i] = sc.nextDouble();
		}
		double maior = vetor[0];
		int posicao = 0;
		for (int i=0; i<n; i++) {
			if (vetor[i]>maior) {
				maior = vetor[i];
				posicao =i+1;
			}
		}
		System.out.printf("MAIOR VALOR = %.1f\n", maior);
		System.out.println("POSICAO DE MAIOR VALOR = " + posicao);
		
		
		sc.close();

	}

}
