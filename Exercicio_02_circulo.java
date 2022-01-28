package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_02_circulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double pi = 3.14159;
		double raioQuadrado = sc.nextDouble();
		raioQuadrado = Math.pow(raioQuadrado, 2.00);

		double area = pi * raioQuadrado;

		System.out.printf("Valor da área do circulo: %.4f%n", area);

		sc.close();
	}

}
