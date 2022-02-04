package exercicios_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x1 = sc.nextInt();
		int x2 = sc.nextInt();

		int conta = x1 + x2 + 2 * (x1 - x2);

		System.out.println("Resultado: " + conta);

		sc.close();

	}

}
