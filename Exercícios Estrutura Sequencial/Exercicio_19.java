package exercicios_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio_19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double real = sc.nextDouble();
		double dolar = real * 5.28;
		double euro = real * 6.02;
		double iens = real * 0.046;

		System.out.printf("Dólar: %.4f%n", dolar);
		System.out.printf("Euro: %.4f%n", euro);
		System.out.printf("Iens: %.4f%n", iens);

		sc.close();

	}

}
