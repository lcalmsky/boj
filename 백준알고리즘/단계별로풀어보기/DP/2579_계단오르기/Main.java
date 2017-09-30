import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int[] stair = new int[n + 1];
		int[][] dp = new int[2][n + 1];

		for (int i = 1; i <= n; i++)
			stair[i] = s.nextInt();

		dp[0][1] = dp[1][1] = stair[1];

		for (int i = 2; i <= n; i++) {

			dp[0][i] = dp[1][i - 1] + stair[i];
			dp[1][i] = Math.max(dp[0][i - 2], dp[1][i - 2]) + stair[i];

		}

		System.out.println(Math.max(dp[0][n], dp[1][n]));

		s.close();

	}
}