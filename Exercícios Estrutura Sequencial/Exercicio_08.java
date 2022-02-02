package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double quadrado, cubo;

		quadrado = Math.pow(a, 2);
		cubo = Math.pow(a, 3);

		System.out.println(a + " elevado ao quadrado: " + quadrado);
		System.out.println(a + " elevado ao cubo: " + cubo);

		sc.close();

	}

}
