package application;

import java.util.Scanner;

public class For7 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
		começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
		exemplo.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor n: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			int a = i*i;
			int b = i*i*i;
			System.out.println(i + " " + a + " " + b);
		}
		
		sc.close();
	}

}
