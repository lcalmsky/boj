package boj1149_rgb거리;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int[][] RGB = new int[N][3];

		for (int i = 0; i < RGB.length; i++) {

			RGB[i][0] = s.nextInt();
			RGB[i][1] = s.nextInt();
			RGB[i][2] = s.nextInt();

		}

		int[][] dp = new int[N][3];

		dp[0][0] = RGB[0][0]; // 처음에 빨간색을 칠한 경우
		dp[0][1] = RGB[0][1]; // 처음에 초록색을 칠한 경우
		dp[0][2] = RGB[0][2]; // 처음에 파란색을 칠한 경우

		for (int i = 1; i < dp.length; i++) {
			// 현재를 빨간색으로 칠하는 경우
			dp[i][0] = Math.min(dp[i - 1][1] + RGB[i][0], dp[i - 1][2] + RGB[i][0]);
			// 현재를 초록색으로 칠하는 경우
			dp[i][1] = Math.min(dp[i - 1][0] + RGB[i][1], dp[i - 1][2] + RGB[i][1]);
			// 현재를 파란색으로 칠하는 경우
			dp[i][2] = Math.min(dp[i - 1][0] + RGB[i][2], dp[i - 1][1] + RGB[i][2]);
		}

		System.out.println(Math.min(Math.min(dp[N - 1][0], dp[N - 1][1]), dp[N - 1][2]));

		s.close();

	}
}