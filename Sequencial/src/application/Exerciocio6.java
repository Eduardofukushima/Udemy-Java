package application;

import java.util.Locale;
import java.util.Scanner;

public class Exerciocio6 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
			mostre:
			a) a área do triângulo retângulo que tem A por base e C por altura.
			b) a área do círculo de raio C. (pi = 3.14159)
			c) a área do trapézio que tem A e B por bases e C por altura.
			d) a área do quadrado que tem lado B.
			e) a área do retângulo que tem lados A e B.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os valores de A, B e C, respectivamente: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double exa = a*c/2;
		double exb = 3.14159*c*c;
		double exc = (a+b)*c/2;
		double exd = b*b;
		double exe = a*b;
		System.out.printf("TRIANGULO: %.3f%n",exa);
		System.out.printf("CIRCULO: %.3f%n",exb);
		System.out.printf("TRAPEZIO: %.3f%n",exc);
		System.out.printf("QUADRADO: %.3f%n",exd);
		System.out.printf("RETANGULO: %.3f%n",exe);
		
		sc.close();

	}

}
