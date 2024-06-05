package atividades;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeQuatro {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float n1, n2, n3, n4, diferenca;
		
		System.out.print("numero1: ");
		n1 = sc.nextFloat();
		
		System.out.print("\nnumero2: ");
		n2 = sc.nextFloat();
		
		System.out.print("\nnumero3: ");
		n3 = sc.nextFloat();
		
		System.out.print("\nnumero4: ");
		n4 = sc.nextFloat();
		
		diferenca = (n1 * n2) - (n3 *n4);
		
		System.out.printf("\nDiferença: %.2f", diferenca);
		
		sc.close();

	}

}
