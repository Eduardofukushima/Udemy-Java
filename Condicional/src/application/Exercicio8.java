package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		/*
		 * Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
		que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
		qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
		Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
		mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
		Ate 2000,00 - isento
		2000.01 ate 3000.00 = 8%
		3000.01 ate 4500.00 = 18%
		acima de 4500.00 28%
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu salario, que informaremos o valor do imposto: ");
		double rs = sc.nextDouble();
		double taxa;
		if (rs<2000) {
			System.out.println("Isento");
		}
		else if (rs>2000 && rs<=3000) {
			taxa = (rs-2000)*8/100;
			System.out.println("RS "+ taxa);
		}
		else if (rs>3000 && rs<=4500) {
			taxa = 80 + (rs-3000)*18/100;
			System.out.println("RS "+ taxa);
		}
		else {
			taxa = 350 + (rs-4500)*28/100;
			System.out.println("RS "+ taxa);			
		}
						
		
		
		
		sc.close();

	}

}
