package exercise1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira um número:");
		int number = scanner.nextInt();
		int sum = 0;

		for (int i = 1; i <= number; i++) {
			sum += i;
		}

		System.out.println("O resultado da soma dos números de 1 até " + number + " é " + sum);

	}
}