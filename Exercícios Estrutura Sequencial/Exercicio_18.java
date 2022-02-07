package exercicios_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio_18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		int x1 = sc.nextInt();

		x = x1 - 1;
		System.out.println("Resultado: " + x);

		x = x1 + 1;
		System.out.println("Resultado: " + x);

		sc.close();
	}

}
