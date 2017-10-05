
/*
 * https://www.acmicpc.net/problem/1699
 * 
 * ����
 * � �ڿ��� N�� �׺��� ���� ���������� ������ ��Ÿ�� �� �ִ�. ���� ��� 11=32+12+12(3�� ��)�̴�. �̷� ǥ������� ���� ������ �� �� �ִµ�, 11�� ��� 11=22+22+12+12+12(5��
 * ��)�� �����ϴ�. �� ���, ������ ��ũ���׽��� ��11�� 3�� ���� ������ ������ ǥ���� �� �ִ�.����� ���Ѵ�. ���� 11�� �׺��� ���� ���� ������ ������ ǥ���� �� �����Ƿ�, 11�� �� �����ν� ǥ���� ��
 * �ִ� ������ ���� �ּ� ������ 3�̴�.
 * 
 * �־��� �ڿ��� N�� �̷��� ���������� ������ ǥ���� ���� �� ���� �ּҰ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է�
 * ù° �ٿ� �ڿ��� N�� �־�����. (1<=N<=100,000)
 * 
 * ���
 * �־��� �ڿ����� �������� ������ ��Ÿ�� ���� �� ������ ���� �ּ� ������ ����Ѵ�.
 * 
 * ���� �Է� ����
 * 7
 * ���� ��� ����
 * 4
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.valueOf(in.readLine());
		int[] dp = new int[n + 1];

		for (int i = 1; i <= n; i++)
			for (int j = 1; j * j <= i; j++)
				dp[i] = dp[i] > dp[i - j * j] + 1 || dp[i] == 0 ? dp[i - j * j] + 1 : dp[i];

		System.out.println(dp[n]);

		in.close();

	}
}
