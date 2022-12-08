package application;

import java.util.Scanner;

public class For5 {

	public static void main(String[] args) {
		/*
		 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		 Lembrando que, por definição, fatorial de 0 é 1.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero que deseja ver o fatorial: ");
		int x = sc.nextInt();
		int fatorial =1 ;
		int count =1;
		for (int i=1; i<=x; i++) {
			if (x>0) {
				fatorial = fatorial*count;
				count = count +1;
			}
			else {
				System.out.println("1");
			}
		}
		System.out.println(fatorial);
		
		sc.close();

	}

}
