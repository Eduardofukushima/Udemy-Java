package application;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
		ordem crescente ou decrescente.
		 */
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite dois inteiros, respectivamente: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a%b == 0 || b%a == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Não sao multiplos");
		}
		
		sc.close();

	}

}
