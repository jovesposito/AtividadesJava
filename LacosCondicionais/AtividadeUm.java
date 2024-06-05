package atividades;

import java.util.Scanner;

public class AtividadeUm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int numA, numB, numC, soma;
		
		System.out.print("Digite o número A: ");
		numA = sc.nextInt();
		
		System.out.print("\nDigite o número B: ");
		numB = sc.nextInt();
		
		System.out.print("\nDigite o número C: ");
		numC = sc.nextInt();
		
		soma = numA + numB;
		
		if (soma > numC) {
			System.out.print("\n" + numB + " + " + numA + " = " + soma + " > " + numC);
			System.out.print("\n\nA soma de A + B é Maior do que C");
		}
		
		if (soma < numC) {
			System.out.print("\n" + numB + " + " + numA + " = " + soma + " < " + numC);
			System.out.print("\n\nA soma de A + B é Menor do que C");
		}
		
		if (soma == numC) {
			System.out.print("\n" + numB + " + " + numA + " = " + soma + " = " + numC);
			System.out.print("\n\nA soma de A + B é Igual a C");
		}
		
		sc.close();
	}

}
