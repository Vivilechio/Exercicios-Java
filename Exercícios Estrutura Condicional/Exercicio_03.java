package exercicios_estrutura_condicional;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A, B;
		System.out.println("Digite os números:");
		A = sc.nextInt();
		B = sc.nextInt();
		if (A % B == 0 || B % A == 0) {
			System.out.println("MÚLTIPLOS");
		} else {
			System.out.println("NÃO MÚLTIPLOS");
		}

		sc.close();
	}

}
