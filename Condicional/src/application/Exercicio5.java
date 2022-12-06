package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
		seguir, calcule e mostre o valor da conta a pagar.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CODIGO     ESPECIFICAÇÃO       PREÇO");
		System.out.println("1          Cachorro Quente     RS 4.00");
		System.out.println("2          X-Salada            RS 4.00");
		System.out.println("3          X-Bacon             RS 4.00");
		System.out.println("4          Torrada simples     RS 4.00");
		System.out.println("5          Refrigerante        RS 4.00");
		
		System.out.println("Digite o codigo do produto que deseja compra: ");
		int cod = sc.nextInt();
		System.out.println("Digite a quantidade: ");
		int qtd = sc.nextInt();
		double valor;
		
		if (cod==1) {
			valor = qtd*4;
		}
		else if (cod==2) {
			valor = qtd*(4.5);
		}
		else if (cod==3) {
			valor = qtd*5;
		}
		else if (cod==4) {
			valor = qtd*2;
		}
		else {
			valor = qtd*1.5;
		}
		System.out.printf("Total: R$ %.2f");
		sc.close();

	}

}
