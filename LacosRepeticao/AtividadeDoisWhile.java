package atividades;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeDoisWhile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String leitura = "s";
		int idade, idGenero, area, totalBack = 0, totalPessoas = 0, totalMulheresFront = 0, totalHomensMobile40 = 0, totalNaoBinariosFull30 = 0;
		float mediaIdades, somaIdades = 0;
		
		while (!leitura.equalsIgnoreCase("n")) {
			System.out.print("Idade: ");
			idade = sc.nextInt();
			
			System.out.print("Identidade de Gênero: ");
			idGenero = sc.nextInt();
			
			System.out.print("Pessoa Desenvolvedora: ");
			area = sc.nextInt();
			System.out.println();
			
			somaIdades += idade;
			
			totalPessoas ++;
			
			if (area == 1) {
				totalBack ++;
			}
			if (area == 2 && (idGenero == 1 || idGenero == 4)) {
				totalMulheresFront ++;
			}
			if (area == 3 && idade > 40 && (idGenero == 2 ||  idGenero == 5)) {
				totalHomensMobile40 ++;
			}
			if (idGenero == 3 && area == 4 && idade < 30) {
				totalNaoBinariosFull30 ++;
			}
			
			System.out.print("Deseja continuar (S/N): ");
			leitura = sc.next();
			System.out.println();
			
		}
		
		mediaIdades = somaIdades / totalPessoas;
		
		System.out.printf("\nO número de pessoas desenvolvedoras Backend: %d \n\nTotal de mulheres cis e trans desenvolvedoras frontend: %d"
				+ " \n\nTotal de homens cis e trans desenvolvedores mobile maiores de 40 anos: %d \n\nTotal de pessoas não binárias desenvolvedoras fullstack"
				+ " menores de 30 anos: %d \n\nO número total de pessoas que responderam à pesquisa: %d \n\nA média de idade das pessoas "
				+ "que responderam à pesquisa: %.2f", totalBack, totalMulheresFront, totalHomensMobile40, totalNaoBinariosFull30, totalPessoas, mediaIdades);
		
		sc.close();
	}

}
