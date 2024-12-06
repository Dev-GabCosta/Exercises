package exercise4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira um número");
		long number = scanner.nextLong();

		System.out.println(isPrime(number));
	}

	public static boolean isPrime(long number) {
		long square = (long) Math.sqrt(number);

		if (number < 2) {
			return false;
		}

		if (number > 2 && number % 2 == 0) {
			return false;
		}

		if (number == 2) {
			return true;
		}

		for (long i = 3; i <= square; i += 2) {
			if (number % i == 0) {
				return false;
			}

		}

		return true;
	}

}
