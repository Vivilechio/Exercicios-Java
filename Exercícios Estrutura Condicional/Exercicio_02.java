package exercicios_estrutura_condicional;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;

		System.out.println("Digite o n�mero:");
		x = sc.nextInt();

		if (x % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("�MPAR");

		}

		sc.close();
	}

}
