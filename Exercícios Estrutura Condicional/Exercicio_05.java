package exercicios_estrutura_condicional;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código: ");
		int codigo = sc.nextInt();
		System.out.println("Digite a quantidade: ");
		int quantidade = sc.nextInt();

		double total = 0;
		if (codigo == 1) {
			total = quantidade * 4.00;
		} else if (codigo == 2) {
			total = quantidade * 4.50;
		} else if (codigo == 3) {
			total = quantidade * 5.00;
		} else if (codigo == 4) {
			total = quantidade * 2.00;
		} else if (codigo == 5) {
			total = quantidade * 1.50;
		}

		System.out.printf("Total do pedido: R$ %.2f%n", total);
		
		sc.close();

	}

}
