package atividades;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeDoisVetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int vetor[] = new int[10], i, soma = 0;
		float media;
		
		for (i = 0; i < 10; i++) {
			System.out.printf("Digite o %dº elemento: ", i+1);
			vetor[i] = sc.nextInt();
			System.out.println();
		}
		
		System.out.println("Elementos nos índices ímpares:");
		for (i = 0; i < 10; i++) {
			if (i % 2 != 0) {
				System.out.print(vetor[i] + " ");
			}
		}
		
		System.out.println("\n\nElementos nos índices pares:");
		for (i = 0; i < 10; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
			}
		}
		
		System.out.print("\n\nSoma: ");
		for (i = 0; i < 10; i++) {
			soma += vetor[i];
		}
		System.out.print(soma);

		media = (float) soma / vetor.length;
		System.out.printf("\n\nMédia: %.2f", media);
		
	}

}
