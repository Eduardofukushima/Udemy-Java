package vetor;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
			- Imprimir todos os elementos do vetor
			- Mostrar na tela a soma e a média dos elementos do vetor
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double [] vetor = new double [n];
		
		double sum =0;
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vetor [i] = sc.nextDouble();
			sum = sum + vetor[i];
		}
		System.out.println();
		System.out.print("VALORES = ");
		
		for (int i=0;i<n;i++) {
			System.out.printf("%.1f  ", vetor[i]);
		}
		System.out.println();
		double media = sum / n;
		
		System.out.printf("Soma = %.2f\n", sum);
		System.out.printf("MEDIA = %.2f\n", media);
		
		
		
		
		sc.close();

	}

}
