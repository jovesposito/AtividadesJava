package atividades;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeDoisMatriz {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int linha, coluna;
		float matrizNotas[][] = new float[10][4], matrizMedias[][] = new float [1][10], soma = 0, media;
		
		for (linha = 0; linha < 10; linha++) {
			System.out.printf("Digite as notas dos 4 bimestres de um ano do %dº participante.\n", linha+1);
			for (coluna = 0; coluna < 4; coluna++) {
				System.out.printf("Nota do bimestre %d: ", coluna+1);
				matrizNotas[linha][coluna] = sc.nextFloat();
			}
			System.out.println();
		}
		
		for (linha = 0; linha < 10; linha++) {
			for (coluna = 0; coluna < 4; coluna++) {
				soma += matrizNotas[linha][coluna];
			}
			media = soma / coluna;
			matrizMedias[0][linha] += media;
			soma = 0;
		}
		
		System.out.println("Vetor\n");
		for (linha = 0; linha < 1; linha++) {
			for (coluna = 0; coluna < 10; coluna++)
			System.out.printf("%.1f ", matrizMedias[linha][coluna], " ");
		}
		
		sc.close();
	}

}
