package atividades;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class AtividadeUmSet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> setInteiros = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o número %d: ", i+1);
			setInteiros.add(sc.nextInt());
		}
		
		Iterator<Integer> iSetInteiros = setInteiros.iterator();
		
		System.out.println("\nListar dados do Set:\n");
		while (iSetInteiros.hasNext()) {
			System.out.println(iSetInteiros.next());
		}
		
		sc.close();
	}

}
