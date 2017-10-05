
/*
 * [출처]
 * https://www.acmicpc.net/problem/11727
 * 
 * [문제]
 * 2×n 직사각형을 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
 * 
 * 아래 그림은 2×17 직사각형을 채운 한가지 예이다.
 * 
 * [입력]
 * 첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)
 * 
 * [출력]
 * 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
 * 
 * [예제 입력] 복사
 * 2
 * [예제 출력] 복사
 * 3
 * [예제 입력 2] 복사
 * 8
 * [예제 출력 2] 복사
 * 171
 * [예제 입력 3] 복사
 * 12
 * [예제 출력 3] 복사
 * 2731
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.valueOf(in.readLine());
		final int mod = 10007;
		int[] dp = new int[n + 1];

		dp[0] = 1;
		dp[1] = 1;

		for (int i = 2; i <= n; i++)
			dp[i] = (dp[i - 2] * 2 + dp[i - 1]) % mod;

		System.out.println(dp[n]);

		in.close();

	}
}