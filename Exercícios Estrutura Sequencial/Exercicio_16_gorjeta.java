package exercicios_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio_16_gorjeta {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double gasto = sc.nextDouble();
		double conta = gasto * 1.10;

		System.out.printf("A cota ficou com a gorjeta em: %.2f%n", conta);

		sc.close();

	}

}
