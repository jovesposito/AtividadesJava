package atividades;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AtividadeDoisSet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		Set<Integer> setInteiros = new HashSet<Integer>();
		
		setInteiros.add(2);
		setInteiros.add(5);
		setInteiros.add(1);
		setInteiros.add(3);
		setInteiros.add(4);
		setInteiros.add(9);
		setInteiros.add(7);
		setInteiros.add(8);
		setInteiros.add(10);
		setInteiros.add(6);
		
		System.out.printf("Digite o número que você deseja encontrar: ");
		num = sc.nextInt();
		
		if (setInteiros.contains(num) == true) {
		 System.out.printf("\nO número %d foi encontrado!", num);
		} else {
			System.out.printf("\nO número %d não foi encontrado!", num);
		}
		
		
		sc.close();
	}

}
