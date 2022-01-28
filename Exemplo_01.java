package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo_01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();

		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.printf("AREA: %.2f%n", area);
		// System.out.println("AREA: " +area);
		System.out.printf("PRECO: %.2f%n", preco);
		// System.out.println("PRECO: " +preco);

		sc.close();

	}

}