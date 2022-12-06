package application;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora de inicio do jogo: ");
		int i = sc.nextInt();
		System.out.println("Digite a hora do termino do jogo: ");
		int f = sc.nextInt();
		int dur = f-i;
		
		if (dur<=0) {
			dur+=24;
			System.out.println("O JOGO DUROU "+dur+" HORA(S)");
		}
		else {
			System.out.println("O JOGO DUROU "+dur+" HORA(S)");
			
		}
		
		sc.close();

	}

}
