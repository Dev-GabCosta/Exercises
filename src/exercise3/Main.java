package exercise3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira um número:");
		int number = scanner.nextInt();
		int count = 0;

		while (number > 0) {
			number /= 10;
			count++;
		}

		System.out.println("Esse número possui " + count + " dígitos");
		scanner.close();
	}
}
