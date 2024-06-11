package atividades;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeUmQueue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean fila = true;
		int opc;
		
		Queue<String> clientes = new LinkedList<String>();
		
		System.out.println("************************************\n");
		System.out.println("1 - Adicionar cliente na fila");
		System.out.println("2 - Listar todos os clientes");
		System.out.println("3 - Retirar cliente da fila");
		System.out.println("0 - Sair");
		System.out.println("\n************************************");
		
		while (fila) {
			System.out.print("\nDigite uma opção: ");
			opc = sc.nextInt();
			
			switch (opc) {
			case 1:
				System.out.print("\nDigite o nome: ");
				clientes.add(sc.next());
				System.out.println("\nFila: \n");
				for (String cliente : clientes) {
					System.out.println(cliente);
				}
				System.out.println("\nCliente adicionado!");
				break;
			case 2:
				System.out.println("\nLista de clientes na fila: \n");
				for (String cliente : clientes) {
					System.out.println(cliente);
				}
				break;
			case 3:
				if (clientes.size() == 0) {
					System.out.println("\nA fila está vazia!");
				} else {
					clientes.poll();
					System.out.println("\nFila: \n");
					for (String cliente : clientes) {
						System.out.println(cliente);
					}
					System.out.println("\nO cliente foi chamado!");
				}
				break;
			case 0:
				System.out.println("\nPrograma finalizado!");
				fila = false;
				break;
			default:
				System.out.println("\nOpção inválida!");
			}
		}
		
		sc.close();
	}

}
