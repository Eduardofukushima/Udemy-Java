package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero do funcionario :");
		int n = sc.nextInt();
		System.out.println("Quantidade de horas trabalhadas: ");
		int hora = sc.nextInt();
		System.out.println("Valor que recebe por hora: ");
		double valor = sc.nextDouble();
		double salary = hora*valor;
		System.out.println("Number = " + n );
		System.out.printf("Salary = U$ %.2f" , salary);
		
		sc.close();

	}

}
