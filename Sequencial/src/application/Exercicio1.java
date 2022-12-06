package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois numeros para se obter a soma deles: ");
		System.out.println("Digite o 1º: ");
		double n1 =sc.nextDouble();
		System.out.println("Digite o 2º: ");
		double n2 = sc.nextDouble();
		double soma = n1 + n2;
		System.out.printf("SOMA = %.0f" , soma);
		
		sc.close();

	}

}
