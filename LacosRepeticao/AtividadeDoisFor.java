package atividades;

import java.util.Scanner;

public class AtividadeDoisFor {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int num, totalPares = 0, totalImpares = 0, i;

			for (i = 0; i < 10; i++) {
				
				System.out.printf("Digite %dº número: ", i+1);
				num = sc.nextInt();
				System.out.println();
				
				if(num % 2 == 0) {
					totalPares += 1;
				} else {
					totalImpares += 1;
				}
			}
			
			System.out.printf("Total de números pares: %d \n\nTotal de números ímpares: %d", totalPares, totalImpares);
			
			sc.close();
		}
	}

}
