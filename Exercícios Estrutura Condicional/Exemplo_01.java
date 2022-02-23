package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo_01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double nota = (x + y) / 2;

		System.out.println("NOTA: " + nota);
		// System.out.printf("NOTA: %.1f%n", nota);
		if (nota < 60.0) {
			// System.out.println("NOTA: " + nota);
			System.out.println("REPROVADO");
		} else {
			// System.out.println("NOTA: " + nota);
			System.out.println("APROVADO");
		}

		sc.close();

	}

}
