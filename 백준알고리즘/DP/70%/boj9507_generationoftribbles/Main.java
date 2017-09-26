package boj9507_generationoftribbles;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		long[] koong = new long[68];
		koong[0] = 1;
		koong[1] = 1;
		koong[2] = 2;
		koong[3] = 4;

		for (int i = 4; i < koong.length; i++) {
			koong[i] = koong[i - 1] + koong[i - 2] + koong[i - 3] + koong[i - 4];
		}

		int t = s.nextInt();

		for (int i = 0; i < t; i++) {

			System.out.println(koong[s.nextInt()]);

		}

		s.close();

	}
}
