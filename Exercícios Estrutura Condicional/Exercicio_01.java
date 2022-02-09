package exercicios_estrutura_condicional;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;

		System.out.println("Digite o número:");
		x = sc.nextInt();

		if (x >= 0) {
			System.out.println("NÃO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}

		sc.close();
	}

}
