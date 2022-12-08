package application;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
			X, se for o caso.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro de 1 a 1000 e informaremos os numeros impares de um ate ele: ");
		int x = sc.nextInt();
		
		for (int i=0; i<=x; i++) {
			if (x>0 && x<=1000 && i%2!=0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
