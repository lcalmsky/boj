package boj6359_만취한상범;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int T = s.nextInt();

		for (int i = 0; i < T; i++) {

			int n = s.nextInt();
			boolean[] room = new boolean[n + 1];

			for (int j = 2; j <= n; j++) {
				for (int k = 1; k <= n; k++) {
					if (k % j == 0)
						room[k] = !room[k];
				}
			}

			int cnt = 0;
			for (int j = 1; j <= n; j++) {
				if (!room[j])
					cnt++;
			}

			System.out.println(cnt);

		}

		s.close();

	}
}