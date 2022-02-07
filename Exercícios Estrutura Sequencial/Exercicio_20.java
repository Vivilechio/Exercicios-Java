package exercicios_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio_20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double dolar = x * 5.28;
		double euro = x * 6.02;
		double iens = x * 0.046;

		System.out.printf("Resultado: %.4f%n", dolar);
		System.out.printf("Resultado: %.4f%n", euro);
		System.out.printf("Resultado: %.4f%n", iens);

		sc.close();

	}

}
