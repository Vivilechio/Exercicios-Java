package exercicios_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio_05_pecas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cod01, cod02, qte01, qte02;
		double valorPeca01, valorPeca02;
		
		cod01 = sc.nextInt();
		qte01 = sc.nextInt();
		valorPeca01 = sc.nextDouble();
		
		cod02 = sc.nextInt();
		qte02 = sc.nextInt();
		valorPeca02 = sc.nextDouble();
		
		double total = valorPeca01 * qte01 + valorPeca02 * qte02;
		
		System.out.println("Código da primeira peça: " +cod01);
		System.out.println("Código da segunda peça: " +cod02);
		System.out.printf("Valor total: %.2f", total);
		
		
		
		sc.close();	

	}

}
