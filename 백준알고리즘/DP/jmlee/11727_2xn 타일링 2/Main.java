
/*
 * [��ó]
 * https://www.acmicpc.net/problem/11727
 * 
 * [����]
 * 2��n ���簢���� 2��1�� 2��2 Ÿ�Ϸ� ä��� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Ʒ� �׸��� 2��17 ���簢���� ä�� �Ѱ��� ���̴�.
 * 
 * [�Է�]
 * ù° �ٿ� n�� �־�����. (1 �� n �� 1,000)
 * 
 * [���]
 * ù° �ٿ� 2��n ũ���� ���簢���� ä��� ����� ���� 10,007�� ���� �������� ����Ѵ�.
 * 
 * [���� �Է�] ����
 * 2
 * [���� ���] ����
 * 3
 * [���� �Է� 2] ����
 * 8
 * [���� ��� 2] ����
 * 171
 * [���� �Է� 3] ����
 * 12
 * [���� ��� 3] ����
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