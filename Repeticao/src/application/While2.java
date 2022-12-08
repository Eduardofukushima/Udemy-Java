package application;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
		cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
		menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite coordenadas (X,Y), que informaremos o quadrante:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x!=0 && y!=0) {
			
			if (x>0 && y>0) {
				System.out.println("Primeiro");
				
			}
			else if (x>0 && y<0) {
				System.out.println("Quarto");
			}
			else if (x<0 && y<0) {
				System.out.println("Terceiro");
			}
			else  {
				System.out.println("Segundo");
			}
			System.out.println("Digite coordenadas (X,Y), que informaremos o quadrante:");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();

	}

}
