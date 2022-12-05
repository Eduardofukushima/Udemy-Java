package application;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/* Fazer um programa para ler dois números inteiros M e N,
		e depois ler uma matriz de M linhas por N colunas contendo 
		números inteiros, podendo haver repetições. Em seguida, ler 
		um número inteiro X que pertence à matriz. Para cada ocorrência 
		de X, mostrar os valores à esquerda, acima, à direita e abaixo 
		de X, quando houver, conforme exemplo.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Em uma matriz NxM: ");
		System.out.print("Digite o valor de N: ");
		int n = sc.nextInt();
		System.out.print("Digite o valor de M: ");
		int m = sc.nextInt();
		int[][] mat = new int [n][m];
		System.out.println("Digite cada linha da Matriz: ");
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Digite o valor de X da Matriz: ");
		int x = sc.nextInt();
		
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position "+ i + ","+ j +":");
					if (j>0) {
						System.out.println("Left "+ mat[i][j-1]);						
					}
					if (j<mat[i].length-1) {
						System.out.println("Right "+ mat[i][j+1]);
					}
					if (i<mat[i].length-1) {
						System.out.println("Down "+ mat[i+1][j]);
					}
					if (i>0) {
						System.out.println("up "+ mat[i-1][j]);						
					}
					
				}
			}
		}
		
		
		sc.close();

	}

}
