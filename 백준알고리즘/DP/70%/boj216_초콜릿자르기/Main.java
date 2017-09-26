package boj216_초콜릿자르기;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt(), m = s.nextInt();

		System.out.println(n - 1 + (m - 1) * n);

		s.close();

	}
}