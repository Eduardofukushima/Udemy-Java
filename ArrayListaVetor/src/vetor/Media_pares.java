package vetor;

import java.util.Locale;
import java.util.Scanner;

public class Media_pares {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
		aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
		digitado, mostrar a mensagem "NENHUM NUMERO PAR"
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros ira ter o vetor? ");
		int n = sc.nextInt();
		int par = 0;
		int qtdpar = 0;
		
		int vetor[] = new int [n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			if (vetor[i]%2==0) {
				par = par + vetor[i];
				qtdpar = qtdpar +1;
			}
		}
		if(qtdpar>0) {
			System.out.println("MEDIA DOS PARES: " + (par/qtdpar));
		}
		else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		
		sc.close();
		

	}

}
