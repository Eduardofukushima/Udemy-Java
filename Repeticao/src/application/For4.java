package application;

import java.util.Scanner;

public class For4 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
		segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe quantas divisoes deseja fazer: ");
		int n = sc.nextInt();
		System.out.println("Informe os numeros que serão divididos: ");
		for (int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if ( b==0) {
				System.out.println("Divisao impossivel!");
			}
			else {
				double divisao = a/b;
				System.out.printf("%.1f%n", divisao);
			}
		}
		
		sc.close();

	}

}
