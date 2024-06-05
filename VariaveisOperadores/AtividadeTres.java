package atividades;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeTres {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.print("Salário bruto: ");
		salarioBruto = sc.nextFloat();
		
		System.out.print("\nAdicional noturno: ");
		adicionalNoturno = sc.nextFloat();
		
		System.out.print("\nHoras extras: ");
		horasExtras = sc.nextFloat();
		
		System.out.print("\nDescontos: ");
		descontos = sc.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("\nSalário líquido: %.2f", salarioLiquido);
		
		sc.close();

	}

}
