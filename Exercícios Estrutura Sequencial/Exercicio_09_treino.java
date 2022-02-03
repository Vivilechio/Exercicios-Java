package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_09_treino {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double serie, repeticao, carga;

		serie = sc.nextDouble();
		repeticao = sc.nextDouble();
		carga = sc.nextDouble();

		double volumeTotal = serie * repeticao * carga;

		System.out.printf("Seu volume total é: %.2f%n", volumeTotal);

		sc.close();

	}

}
