package exercicios_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio_03_diferenca {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A, B, C, D;

		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

		int DIFERENCA = (A * B - C * D);

		System.out.println("Resultado: " + DIFERENCA);

		sc.close();

	}

}
