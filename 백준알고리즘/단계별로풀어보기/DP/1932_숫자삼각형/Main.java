package boj1932_숫자삼각형;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int[][] dp = new int[n][n];
		int[][] triangle = new int[n][n];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < i + 1; j++) {

				triangle[i][j] = s.nextInt();
			}

		}

		dp[0][0] = triangle[0][0];
		dp[1][0] = dp[0][0] + triangle[1][0];
		dp[1][1] = dp[0][0] + triangle[1][1];

		for (int i = 2; i < n; i++) {

			for (int j = 0; j < i + 1; j++) {

				if (j == 0) {

					dp[i][j] = dp[i - 1][j] + triangle[i][j];

				} else {

					dp[i][j] = Math.max(dp[i - 1][j - 1] + triangle[i][j], dp[i - 1][j] + triangle[i][j]);

				}

			}

		}

		int max = 0;
		for (int i = 0; i < n; i++) {

			max = dp[n - 1][i] > max ? dp[n - 1][i] : max;

		}

		System.out.println(max);

		s.close();

	}

}
// for (int i = 0; i < triangle.length; i++) {
// for (int j = 0; j < triangle[i].length; j++) {
// System.out.print(dp[i][j] + "\t");
// }
// System.out.println();
// }