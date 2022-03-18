package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo_04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int minutos = sc.nextInt();
		double conta = 50.00;
		if (minutos > 100.00) {
			conta += (minutos - 100.00) * 2.00;
			// conta = conta + (minutos - 100.00) * 2.00;
		}

		System.out.printf("Valor da conta:R$ %.2f%n", conta);

		sc.close();

	}

}
