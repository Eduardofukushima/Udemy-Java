package application;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		/*
		 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
		um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
		4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
		que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
		mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
		exemplo.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Participe da nossa votação, escolha o combustivel que prefere: ");
		System.out.println("1 - Alcool");
		System.out.println("2 - Gasolina");
		System.out.println("3 - Diesel");
		System.out.println("4 - Fim");
		
		int voto = sc.nextInt();
		int count1=0;
		int count2=0;
		int count3=0;
		
		while (voto != 4) {
			if (voto == 1) {
				count1 ++;
			}
			else if (voto == 2) {
				count2 ++;
			}
			else if (voto == 3) {
				count3 ++;
			} 
			else {
				
			}
		voto = sc.nextInt();	
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool : " + count1);
		System.out.println("Gasolina : " + count2);
		System.out.println("Diesel : " + count3);
		
		sc.close();
	}

}
