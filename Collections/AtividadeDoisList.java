package atividades;

import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeDoisList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;

		ArrayList<Integer> inteiros = new ArrayList<Integer>();
		
		inteiros.add(2);
		inteiros.add(5);
		inteiros.add(1);
		inteiros.add(3);
		inteiros.add(4);
		inteiros.add(9);
		inteiros.add(7);
		inteiros.add(8);
		inteiros.add(10);
		inteiros.add(6);
		
		System.out.printf("Digite o número que você deseja encontrar: ");
		num = sc.nextInt();
		
		if (inteiros.contains(num) == true) {
		 System.out.printf("\nO número %d está localizado na posição: %d", num, inteiros.indexOf(num));
		} else {
			System.out.printf("\nO número %d não foi encontrado!", num);
		}
		
		sc.close();
	}

}
