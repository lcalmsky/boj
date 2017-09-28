package 날짜계산_1476;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int E = s.nextInt(), S = s.nextInt(), M = s.nextInt();

		E = E % 15 == 0 ? 0 : E;
		S = S % 28 == 0 ? 0 : S;
		M = M % 19 == 0 ? 0 : M;

		for (int i = 1;; i++) {

			if (i % 15 == E && i % 28 == S && i % 19 == M) {
				System.out.println(i);
				break;
			}

		}

		s.close();

	}

}
