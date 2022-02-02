package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_07_media {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double nota1, nota2, nota3, media;

		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		nota3 = sc.nextDouble();
		media = (nota1 + nota2 + nota3) / 3;

		System.out.printf("Sua média é %.2f%n", media);

		sc.close();
	}

}
