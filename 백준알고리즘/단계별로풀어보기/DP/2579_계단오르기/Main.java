package boj2579_계단오르기;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int[] stair = new int[n + 1];
		int[][] dp = new int[n + 1][2];

		for (int i = 1; i <= n; i++)
			stair[i] = s.nextInt();

		dp[1][0] = dp[1][1] = stair[1];

		for (int i = 2; i <= n; i++) {

			dp[i][0] = dp[i - 1][1] + stair[i];
			dp[i][1] = Math.max(dp[i - 2][0], dp[i - 2][1]) + stair[i];

		}
		
		System.out.println(Math.max(dp[n][0], dp[n][1]));

		s.close();

	}
}