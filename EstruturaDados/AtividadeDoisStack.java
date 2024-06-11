package atividades;

import java.util.Scanner;
import java.util.Stack;

public class AtividadeDoisStack {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean fila = true;
		int opc;
		
		Stack<String> livros = new Stack<String>();
		
		System.out.println("************************************\n");
		System.out.println("1 - Adicionar livro na pilha");
		System.out.println("2 - Listar todos os livros");
		System.out.println("3 - Retirar livro da pilha");
		System.out.println("0 - Sair");
		System.out.println("\n************************************");
		
		while (fila) {
			System.out.print("\nDigite uma opção: ");
			opc = sc.nextInt();
			
			switch (opc) {
			case 1:
				System.out.print("\nDigite o nome: ");
				sc.nextLine();
				livros.add(sc.nextLine());
				System.out.println("\nPilha: \n");
				for (String livro : livros) {
					System.out.println(livro);
				}
				System.out.println("\nLivro adicionado!");
				break;
			case 2:
				System.out.println("\nLista de livros na pilha: \n");
				for (String livro : livros) {
					System.out.println(livro);
				}
				break;
			case 3:
				if (livros.size() == 0) {
					System.out.println("\nA pilha está vazia!");
				} else {
					livros.pop();
					System.out.println("\nPilha: \n");
					for (String livro : livros) {
						System.out.println(livro);
					}
					System.out.println("\nUm livro foi retirado da pilha!");
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
