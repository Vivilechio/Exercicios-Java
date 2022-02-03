package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_10_mediaPonderada {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int peso1 = 2, peso2 = 3, peso3 = 5;

		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();

		double mediaPonderada = (peso1 * nota1 + peso2 * nota2 + peso3 * nota3) / (peso1 + peso2 + peso3);
		
		System.out.printf("Sua média é: %.2f%n", mediaPonderada);

		sc.close();
	}

}
