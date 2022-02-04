package exercicios_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio_14_medida {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double pes = sc.nextDouble();
		double polegadas = pes * 12.0;
		double jardas = pes / 3.0;
		double milhas = pes / 5280.0;

		System.out.printf("Conversão de Pés para Polegadas: %.2f%n", polegadas);
		System.out.printf("Conversão de Pés para Jardas: %.2f%n", jardas);
		System.out.printf("Conversão de Pés para Milhas: %.8f%n", milhas);

		sc.close();

	}

}
