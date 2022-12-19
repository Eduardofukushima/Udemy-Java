package vetor;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
		tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
		bem como os nomes dessas pessoas caso houver.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		String [] pessoa = new String [n];
		int [] idade = new int [n];
		double [] altura = new double[n];
		
		double sum_altura = 0;
		
		for (int i=0; i<n; i++) {
			System.out.print("Dados da " + (i+1) + "a pessoa:");
			System.out.println();
			System.out.print("Nome : ");
			pessoa [i] = sc.next();
			System.out.print("Idade : ");
			idade [i] = sc.nextInt();
			System.out.print("Altura : ");
			altura [i] = sc.nextDouble();

			sum_altura = sum_altura + altura[i];
		}
		double media_altura = sum_altura/n;
		System.out.println();
		System.out.printf("Altura média: %.2f\n" , media_altura);
		System.out.print("Pessoas com menos de 16 anos: ");
		
		double menor = 0;
		for (int i=0; i<n; i++) {
			if (idade[i] < 16) {
				menor = menor + 1;
			}
		}
		System.out.printf("%.1f%%\n" , 100*menor/n);
		System.out.print("%");
		
		for (int i=0; i<n; i++) {
			if (idade[i] < 16) {
				System.out.println(pessoa[i]);
			}
		}
		
		
		sc.close();

	}

}
