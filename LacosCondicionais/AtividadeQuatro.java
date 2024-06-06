package atividades;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeQuatro {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nomeColaborador, cargo = "";
		int codigoCargo;
		float salario, novoSalario, reajuste = 0;
		
		System.out.print("Nome do colaborador: ");
		nomeColaborador = sc.nextLine();
		
		System.out.print("\nCargo: ");
		codigoCargo = sc.nextInt();
		
		System.out.print("\nSalário: R$ ");
		salario = sc.nextFloat();
		
		switch (codigoCargo) {
		case 1:
			cargo = "Gerente";
			reajuste = 0.1f;
			break;
		case 2:
			cargo = "Vendedor";
			reajuste = 0.07f;
			break;
		case 3:
			cargo = "Supervisor";
			reajuste = 0.09f;
			break;
		case 4:
			cargo = "Motorista";
			reajuste = 0.06f;
			break;
		case 5:
			cargo = "Estoquista";
			reajuste = 0.05f;
			break;
		case 6:
			cargo = "Técnico de TI";
			reajuste = 0.08f;
			break;
		default:
			System.out.println("Código do cargo inválido!");
	}
		
		
		novoSalario = salario + (reajuste * salario);
		
		System.out.printf("\nNome do colaborador: %s \n\nCargo: %s \n\nSalário: R$ %.2f", nomeColaborador, cargo, novoSalario);
		
		sc.close();
	}

}
