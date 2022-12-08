package application;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
		Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
		essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Iremos verificar numero no intervalo de 10 a 20.");
		System.out.println("Digite quantos numeros deseja analisar: ");
		
		int n = sc.nextInt();
		int countin = 0;
		int countout =0;
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			if (x>=10 && x<=20) {
				countin ++;
			}
			else {
				countout ++;
			}
			
		}
		
		System.out.println(countin + "in");
		System.out.println(countout + "out");
		
		sc.close();

	}

}
