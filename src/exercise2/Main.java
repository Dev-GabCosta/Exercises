package exercise2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira um número");
		int number = scanner.nextInt();
		int fat = 1;
		String message = "O fatorial desse número é ";

		if (number == 0 || number == 1) {
			System.out.println(message + number);
		}

		for (int i = 1; i <= number; i++) {
			fat *= i;
		}

		System.out.println(message + fat);
	}
}
