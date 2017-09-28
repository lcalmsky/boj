package boj1003_피보나치함수;

import java.util.Scanner;

public class Main {

	private static int f0;
	private static int f1;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int T = s.nextInt();

		while (T-- > 0) {

			int n = s.nextInt();

			f0 = 0;
			f1 = 0;

			fibonacci(n);

			System.out.println(f0 + " " + f1);

		}

		s.close();

	}

	private static int fibonacci(int n) {

		if (n == 0) {

			f0++;
			return 0;

		} else if (n == 1) {
			
			f1++;
			return 1;

		} else {

			return fibonacci(n - 1) + fibonacci(n - 2);

		}
	}
}
