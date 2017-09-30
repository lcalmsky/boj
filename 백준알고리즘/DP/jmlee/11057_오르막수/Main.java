
/*
 * [����]
 * ������ ���� ���� �ڸ��� ���������� �̷�� ���� ���Ѵ�. �� ��, ������ ���� ���Ƶ� ������������ ģ��.
 * ���� ���, 2234�� 3678, 11119�� ������ ��������, 2232, 3676, 91111�� ������ ���� �ƴϴ�.
 * ���� ���� N�� �־����� ��, ������ ���� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� 0���� ������ �� �ִ�.
 * 
 * [�Է�]
 * ù° �ٿ� N (1 �� N �� 1,000)�� �־�����.
 * 
 * [���]
 * ù° �ٿ� ���̰� N�� ������ ���� ������ 10,007�� ���� �������� ����Ѵ�.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int dp[][] = new int[n + 1][10];

		for (int i = 0; i < dp[1].length; i++)
			dp[1][i] = 1;

		for (int i = 2; i < dp.length; i++) {
			for (int j = 0; j < dp[i].length; j++) {
				for (int k = j; k < dp[i].length; k++)
					dp[i][j] += dp[i - 1][k] % 10007;
			}
		}

		int sum = 0;

		for (int i = 0; i < dp[n].length; i++) {
			sum += dp[n][i];
		}

		System.out.println(sum % 10007);

		s.close();

	}
}