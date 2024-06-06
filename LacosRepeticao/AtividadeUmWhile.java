package atividades;

import java.util.Scanner;

public class AtividadeUmWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int idade = 0, totalMenor = 0, totalMaior = 0;
		
		while (idade >= 0) {
			
			System.out.print("\nDigite uma idade: ");
			idade = sc.nextInt();
			
			if (idade < 21 && idade > 0) {
				totalMenor += 1;
			}
			
			if (idade > 50) {
				totalMaior += 1;
			}
			
		}
		
		System.out.printf("\nTotal de pessoas menores de 21 anos: %d \n\nTotal de pessoas maiores de 50 anos: %d", totalMenor, totalMaior);
		
		sc.close();
	}

}
