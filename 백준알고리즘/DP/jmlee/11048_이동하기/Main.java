
/*
 * https://www.acmicpc.net/problem/11048
 * 
 * 문제
 * 준규는 N×M 크기의 미로에 갇혀있다. 미로는 1×1크기의 방으로 나누어져 있고, 각 방에는 사탕이 놓여져 있다. 미로의 가장 왼쪽 윗 방은 (1, 1)이고, 가장 오른쪽 아랫 방은 (N, M)이다.
 * 
 * 준규는 현재 (1, 1)에 있고, (N, M)으로 이동하려고 한다. 준규가 (i, j)에 있으면, (i+1, j), (i, j+1), (i+1, j+1)로 이동할 수 있고, 각 방을 방문할 때마다 방에
 * 놓여져있는 사탕을 모두 가져갈 수 있다. 또, 미로 밖으로 나갈 수는 없다.
 * 
 * 준규가 (N, M)으로 이동할 때, 가져올 수 있는 사탕 개수의 최대값을 구하시오.
 * 
 * 입력
 * 첫째 줄에 미로의 크기 N, M이 주어진다. (1 ≤ N, M ≤ 1,000)
 * 
 * 둘째 줄부터 N개 줄에는 총 M개의 숫자가 주어지며, i번째 줄의 j번째 숫자는 (i, j)에 놓여져 있는 사탕의 개수이다. 사탕의 개수는 0보다 크거나 같고, 100보다 작거나 같다.
 * 
 * 출력
 * 첫째 줄에 준규가 (N, M)으로 이동할 때, 가져올 수 있는 사탕 개수를 출력한다.
 * 
 * 예제 입력 복사
 * 3 4
 * 1 2 3 4
 * 0 0 0 5
 * 9 8 7 6
 * 예제 출력 복사
 * 31
 * 예제 입력 2 복사
 * 3 3
 * 1 0 0
 * 0 1 0
 * 0 0 1
 * 예제 출력 2 복사
 * 3
 * 예제 입력 3 복사
 * 4 3
 * 1 2 3
 * 6 5 4
 * 7 8 9
 * 12 11 10
 * 예제 출력 3 복사
 * 47
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(in.readLine());

		int n = Integer.valueOf(st.nextToken()), m = Integer.valueOf(st.nextToken());

		int[][] maze = new int[n + 1][m + 1];
		int[][] dp = new int[n + 1][m + 1];

		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(in.readLine());
			for (int j = 1; j <= m; j++)
				maze[i][j] = Integer.valueOf(st.nextToken());
		}

		dp[1][1] = maze[1][1];

		for (int i = 1; i == 1; i++) {
			for (int j = 2; j <= m; j++) {
				dp[i][j] = dp[i][j - 1] + maze[i][j];
			}
		}

		for (int i = 1; i == 1; i++) {
			for (int j = 2; j <= n; j++) {
				dp[j][i] = dp[j - 1][i] + maze[j][i];
			}
		}

		for (int i = 2; i <= n; i++) {
			for (int j = 2; j <= m; j++) {

				dp[i][j] = max(dp[i - 1][j - 1], dp[i][j - 1], dp[i - 1][j]) + maze[i][j];

			}
		}

		System.out.println(dp[n][m]);

		in.close();

	}

	private static int max(int i, int j, int k) {
		int max = i > j ? i : j;
		return i > j ? i : j > k ? max : k;
	}
}