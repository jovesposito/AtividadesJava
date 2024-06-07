package atividades;

import java.util.Scanner;

public class AtividadeUmVetor {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int vetor[] = {2,5,1,3,4,9,7,8,10,6}, num, posicao = -1, i;
			
			System.out.print("Digite o número que você deseja encontrar: ");
			num = sc.nextInt();
			
			for (i = 0; i < 10; i++) {		
				if (vetor[i] == num) {
					posicao = i;
				}	
			}
			
			if (posicao != -1) {
				System.out.printf("\nO número %d está localizado na posição: %d", num, posicao);
			} else {
				System.out.printf("\nO número %d não foi encontrado!", num);
			}
			
			sc.close();
		}
	}

}
