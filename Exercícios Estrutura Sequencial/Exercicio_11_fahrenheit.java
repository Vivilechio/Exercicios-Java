package exercicios_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio_11_fahrenheit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double celsius = sc.nextDouble();
		double fahrenheit = 180 * (celsius + 32) / 100;

		System.out.printf("Valor em Fahrenheit: %.2f%n", fahrenheit);

		sc.close();
	}

}
