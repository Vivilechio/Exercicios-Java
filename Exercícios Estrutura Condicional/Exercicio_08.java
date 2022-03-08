package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double imposto;
		if (x <= 2000.00) {
			imposto = 0.0;
		} else if (x <= 3000.00) {
			imposto = (x - 2000.00) * 0.08;
		} else if (x <= 4500.00) {
			imposto = (x - 3000.00) * 0.18 + 1000.00 * 0.08;
		} else {
			imposto = (x - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
		}
		if (imposto == 0) {
			System.out.println("ISENTO");
		} else {
			System.out.printf("R$%.2f%n", imposto);
		}

		sc.close();
	}

}

