package atividades;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeUm {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float salario, abono, novoSalario;
		
		System.out.print("Digite o salário: ");
		salario = sc.nextFloat();
		
		System.out.print("\nDigite o abono: ");
		abono = sc.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("\nNovo salário: %.2f", novoSalario);
		
		
		sc.close();
	}

}
