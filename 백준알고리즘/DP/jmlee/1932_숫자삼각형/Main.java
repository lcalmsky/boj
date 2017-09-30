
/*
 * https://www.acmicpc.net/problem/1932
 * 
 * [문제]
 * 7
 * 3 8
 * 8 1 0
 * 2 7 4 4
 * 4 5 2 6 5
 * 위 그림은 크기가 5인 숫자 삼각형의 한 모습이다.
 * 
 * 맨 위층 7부터 시작해서 아래에 있는 수 중 하나를 선택하여 아래층으로 내려올 때, 이제까지 선택된 수의 합이 최대가 되는 경로를 구하는 프로그램을 작성하라. 아래층에 있는 수는 현재 층에서 선택된 수의 대각선
 * 왼쪽 또는 대각선 오른쪽에 있는 것 중에서만 선택할 수 있다.
 * 
 * 삼각형의 크기는 1 이상 500 이하이다. 삼각형을 이루고 있는 각 숫자는 모두 정수이며, 범위는 0 이상 99 이하이다.
 * 
 * [입력]
 * 첫째 줄에 삼각형의 크기 n(1≤n≤500)이 주어지고, 둘째 줄부터 n+1줄까지 숫자 삼각형이 주어진다.
 * 
 * [출력]
 * 첫째 줄에는 최대가 되는 합을 출력한다.
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), max = 0;
		int[][] triangle = new int[n + 1][n + 1], dp = new int[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				triangle[i][j] = s.nextInt();
				if (i == j) break;
			}
		}

		dp[1][1] = triangle[1][1];

		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= n; j++)
				dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1]) + triangle[i][j];
		}

		for (int i = 0; i < dp[n].length; i++)
			max = max > dp[n][i] ? max : dp[n][i];

		System.out.println(max);

		s.close();

	}
}