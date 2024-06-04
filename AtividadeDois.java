package atividades;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeDois {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, mediaFinal;
		
		System.out.print("Nota 1: ");
		nota1 = sc.nextFloat();
		
		System.out.print("\nNota 2: ");
		nota2 = sc.nextFloat();
		
		System.out.print("\nNota 3: ");
		nota3 = sc.nextFloat();
		
		System.out.print("\nNota 4: ");
		nota4 = sc.nextFloat();
		
		mediaFinal = (nota1 + nota2 + nota3 +nota4) / 4;
		
		System.out.printf("\nMédia final: %.1f", mediaFinal);
		
		sc.close();
	}

}
