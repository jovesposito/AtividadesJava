package atividades;

import java.util.Scanner;

public class AtividadeUmMatriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int matriz[][] = new int[3][3], linha, coluna, somaPrincipal = 0, somaSecundaria = 0;
		
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna ++) {
				System.out.printf("Digite o número da posição (%d,%d): ", linha, coluna);
				matriz[linha][coluna] = sc.nextInt();
				System.out.println();
			}
		}
		
		System.out.println("Elementos da Diagonal Principal:");
		for (linha = 0; linha < 3; linha++) {
			System.out.print(matriz[linha][linha]+ " ");
			somaPrincipal += matriz[linha][linha];
		}
		
		System.out.println("\n\nElementos da Diagonal Secundária:");
		for (linha = 0; linha < 3; linha++) {
			System.out.print(matriz[linha][2 - linha] + " ");
			somaSecundaria += matriz[linha][2 - linha];
		}
		
		System.out.println("\n\nSoma dos Elementos da Diagonal Principal: \n" + somaPrincipal);
		
		System.out.println("\n\nSoma dos Elementos da Diagonal Secundária: \n" + somaSecundaria);
		
		sc.close();

	}

}
