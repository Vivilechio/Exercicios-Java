package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double pi = 3.14159;
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
	
		double TRIANGULO = A * C / 2.0;
		System.out.printf("Triângulo: %.3f%n", TRIANGULO);
		double CIRCULO = pi * C * C;
		System.out.printf("Circulo: %.3f%n", CIRCULO);
		double TRAPEZIO = (A + B) / 2 * C;
		System.out.printf("Trapézio: %.3f%n", TRAPEZIO);
		double QUADRADO = Math.pow(B, 2.0);
		System.out.printf("Quadrado: %.3f%n", QUADRADO);
		double RETANGULO = A * B;
		System.out.printf("Retângulo: %.3f%n", RETANGULO);

		sc.close();

	}

}
