package application;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os valores A,B,C e D respectivamente que informaremos - DIFERENCA = (A * B - C * D)");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int diferenca = (a*b-c*d);
		System.out.println("DIFERENCA = " + diferenca);
		
		sc.close();

	}

}
