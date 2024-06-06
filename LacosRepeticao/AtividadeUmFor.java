package atividades;

import java.util.Scanner;

public class AtividadeUmFor {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int num1, num2, i;

			System.out.print("Digite o primeiro número do intervalo: ");
			num1 = sc.nextInt();

			System.out.print("\nDigite o último número do intervalo: ");
			num2 = sc.nextInt();

			if (num1 < num2) {
				System.out.printf("\nNo intervalo entre %d e %d:\n\n", num1, num2);
				for (i = num1; i <= num2; i++) {
					if (i % 3 == 0 && i % 5 == 0) {
						System.out.printf("%d é múltiplo de 3 e 5\n", i);
					}
				}
			} else {
				System.out.print("\nIntervalo inválido!");
			}

			sc.close();
		}
	}
}