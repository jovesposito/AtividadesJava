package atividades;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeDois {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		double preco = 0, valorTotal;
		String produto = "";
		
		System.out.print("Código do Produto: ");
		codigo = sc.nextInt();
		
		System.out.print("\nQuantidade: ");
		quantidade = sc.nextInt();
		
		switch (codigo) {
			case 1:
				produto = "Cachorro Quente";
				preco = 10.00;
				break;
			case 2:
				produto = "X-Salada";
				preco = 15.00;
				break;
			case 3:
				produto = "X-Bacon";
				preco = 18.00;
				break;
			case 4:
				produto = "Bauru";
				preco = 12.00;
				break;
			case 5:
				produto = "Refrigerante";
				preco = 5.00;
				break;
			case 6:
				produto = "Suco de laranja";
				preco = 13.00;
				break;
			default:
				System.out.println("Código do produto inválido!");
		}
		
		valorTotal = quantidade * preco;
		
		System.out.printf("\nProduto: %s \n\nValor total: R$ %.2f", produto, valorTotal);
				
		sc.close();
	}

}
