
/*
 * https://www.acmicpc.net/problem/1932
 * 
 * [����]
 * 7
 * 3 8
 * 8 1 0
 * 2 7 4 4
 * 4 5 2 6 5
 * �� �׸��� ũ�Ⱑ 5�� ���� �ﰢ���� �� ����̴�.
 * 
 * �� ���� 7���� �����ؼ� �Ʒ��� �ִ� �� �� �ϳ��� �����Ͽ� �Ʒ������� ������ ��, �������� ���õ� ���� ���� �ִ밡 �Ǵ� ��θ� ���ϴ� ���α׷��� �ۼ��϶�. �Ʒ����� �ִ� ���� ���� ������ ���õ� ���� �밢��
 * ���� �Ǵ� �밢�� �����ʿ� �ִ� �� �߿����� ������ �� �ִ�.
 * 
 * �ﰢ���� ũ��� 1 �̻� 500 �����̴�. �ﰢ���� �̷�� �ִ� �� ���ڴ� ��� �����̸�, ������ 0 �̻� 99 �����̴�.
 * 
 * [�Է�]
 * ù° �ٿ� �ﰢ���� ũ�� n(1��n��500)�� �־�����, ��° �ٺ��� n+1�ٱ��� ���� �ﰢ���� �־�����.
 * 
 * [���]
 * ù° �ٿ��� �ִ밡 �Ǵ� ���� ����Ѵ�.
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