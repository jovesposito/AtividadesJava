package atividades;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeDoisDoWhile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num;
		float media, soma = 0, contador = 0;
		
		do {
			System.out.print("Digite um número: ");
			num = sc.nextInt();
			System.out.println();
			
			if (num % 3 == 0 && num != 0) {
				soma += num;
				contador ++;
			}
			
		} while (num != 0);
		
		
		media = soma / contador;
		
		System.out.printf("A média de todos os números múltiplos de 3 é: %.1f", media);
		
		sc.close();
	}

}
