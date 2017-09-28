package ¸·´ë±â_1094;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int X = s.nextInt();
		int cnt = 0;

		while (X != 0) {

			cnt += X % 2;
			X /= 2;

		}

		System.out.println(cnt);
		s.close();
	}

}
