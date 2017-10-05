
/*
 * https://www.acmicpc.net/problem/11048
 * 
 * ����
 * �رԴ� N��M ũ���� �̷ο� �����ִ�. �̷δ� 1��1ũ���� ������ �������� �ְ�, �� �濡�� ������ ������ �ִ�. �̷��� ���� ���� �� ���� (1, 1)�̰�, ���� ������ �Ʒ� ���� (N, M)�̴�.
 * 
 * �رԴ� ���� (1, 1)�� �ְ�, (N, M)���� �̵��Ϸ��� �Ѵ�. �ر԰� (i, j)�� ������, (i+1, j), (i, j+1), (i+1, j+1)�� �̵��� �� �ְ�, �� ���� �湮�� ������ �濡
 * �������ִ� ������ ��� ������ �� �ִ�. ��, �̷� ������ ���� ���� ����.
 * 
 * �ر԰� (N, M)���� �̵��� ��, ������ �� �ִ� ���� ������ �ִ밪�� ���Ͻÿ�.
 * 
 * �Է�
 * ù° �ٿ� �̷��� ũ�� N, M�� �־�����. (1 �� N, M �� 1,000)
 * 
 * ��° �ٺ��� N�� �ٿ��� �� M���� ���ڰ� �־�����, i��° ���� j��° ���ڴ� (i, j)�� ������ �ִ� ������ �����̴�. ������ ������ 0���� ũ�ų� ����, 100���� �۰ų� ����.
 * 
 * ���
 * ù° �ٿ� �ر԰� (N, M)���� �̵��� ��, ������ �� �ִ� ���� ������ ����Ѵ�.
 * 
 * ���� �Է� ����
 * 3 4
 * 1 2 3 4
 * 0 0 0 5
 * 9 8 7 6
 * ���� ��� ����
 * 31
 * ���� �Է� 2 ����
 * 3 3
 * 1 0 0
 * 0 1 0
 * 0 0 1
 * ���� ��� 2 ����
 * 3
 * ���� �Է� 3 ����
 * 4 3
 * 1 2 3
 * 6 5 4
 * 7 8 9
 * 12 11 10
 * ���� ��� 3 ����
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