package exercicios_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio_17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double raiz = Math.sqrt(x);

		System.out.println("Resultado: " + raiz);

		sc.close();

	}

}
