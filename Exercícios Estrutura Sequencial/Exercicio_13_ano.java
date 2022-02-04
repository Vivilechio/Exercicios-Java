package exercicios_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio_13_ano {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int anoNascimento = sc.nextInt();
		int anoAtual = sc.nextInt();

		int diferenca = anoAtual - anoNascimento;

		System.out.println("Sua idade é: " + diferenca);

		sc.close();
	}

}
