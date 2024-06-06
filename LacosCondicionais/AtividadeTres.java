package atividades;

import java.util.Scanner;

public class AtividadeTres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um número: ");
		num = sc.nextInt();
		
		if (num % 2 == 0 && num >= 0) {
			System.out.printf("\nO número %d é par e positivo!", num);
		} else if (num % 2 == 0 && num < 0) {
			System.out.printf("\nO número %d é par e negativo!", num);
		} else if (num % 2 != 0 && num >= 0) {
			System.out.printf("\nO número %d é ímpar e positivo!", num);
		} else {
			System.out.printf("\nO número %d é ímpar e negativo!", num);
		}
		
		sc.close();
	}

}
