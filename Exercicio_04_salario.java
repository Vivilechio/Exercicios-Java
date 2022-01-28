package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04_salario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int numero, horas;
		double valorHora;

		numero = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();

		double salario = horas * valorHora;

		System.out.println("NUMBER: " + numero);
		System.out.printf("SALARY: U$ %.2f", salario);

		sc.close();

	}

}
