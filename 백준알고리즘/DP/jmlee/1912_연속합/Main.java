
/*
 * [����]
 * n���� ������ �̷���� ������ ������ �־�����. �츮�� �� �� ���ӵ� �� ���� ���ڸ� �����ؼ� ���� �� �ִ� �� �� ���� ū ���� ���Ϸ��� �Ѵ�. ��, ���ڴ� �� �� �̻� �����ؾ� �Ѵ�.
 * ���� �� 10, -4, 3, 1, 5, 6, -35, 12, 21, -1 �̶�� ������ �־����ٰ� ����. ���⼭ ������ 12+21�� 33�� ������ �ȴ�.
 * 
 * [�Է�]
 * ù° �ٿ� ���� n(1��n��100,000)�� �־����� ��° �ٿ��� n���� ������ �̷���� ������ �־�����. ���� -1,000���� ũ�ų� ����, 1,000���� �۰ų� ���� �����̴�.
 * 
 * [���]
 * ù° �ٿ� ���� ����Ѵ�.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int seq[] = new int[n + 1], dp[] = new int[n + 1];

		for (int i = 1; i <= n; i++)
			seq[i] = s.nextInt();

		for (int i = 1; i <= n; i++)
			dp[i] = dp[i - 1] + seq[i] > seq[i] ? dp[i - 1] + seq[i] : seq[i];

		int max = dp[1];
		for (int i = 1; i <= n; i++)
			max = max > dp[i] ? max : dp[i];

		System.out.println(max);
		
		for (int i = 0; i < dp.length; i++) {
			System.out.print(dp[i] + " ");
		}

		s.close();

	}
}