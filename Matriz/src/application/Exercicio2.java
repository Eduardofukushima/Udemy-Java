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
		System.out.println();
		System.out.print("Digite o valor de M: ");
		int m = sc.nextInt();
		int[][] mat = new int [n][m];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[n][m] = sc.nextInt();
			}
		}
		
		System.out.print("Digite o valor de X da Matriz: ");
		int x = sc.nextInt();
		
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position "+ i + ","+ j);
					System.out.println("Left "+ i + ","+ (j-1));
					System.out.println("Right "+ i + ","+ (j+1));
					System.out.println("Down "+ (i+1) + ","+ j);
					System.out.println("up "+ (i-1) + ","+ j);
				}
			}
		}
		
		
		sc.close();

	}

}
