package atividades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AtividadeUmList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("Digite a cor %d: ", i+1);
			cores.add(sc.next());
		}
		
		System.out.println("\nListar todas as cores:\n");
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		Collections.sort(cores);
		
		System.out.println("\nOrdenar as cores:\n");
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		sc.close();
	}

}
