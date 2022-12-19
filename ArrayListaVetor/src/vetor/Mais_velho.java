package vetor;

import java.util.Scanner;

public class Mais_velho {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
		devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
		da pessoa mais velha.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce ira digitar? ");
		int n = sc.nextInt();
		
		String nome[] = new String[n];
		int idade[] = new int [n];
		int velho = 0;
		String maisVelho = null;
		
		for (int i=0; i<n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		for (int i=0; i<n; i++) {
			if (idade[i]>velho) {
				velho = idade[i];
				maisVelho = nome[i];
			}
		}
		System.out.println("PESSOA MAIS VELHA: " + maisVelho );
		
		
		
		sc.close();

	}

}
