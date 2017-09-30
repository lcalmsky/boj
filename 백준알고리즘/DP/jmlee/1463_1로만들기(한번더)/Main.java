
/*
 * [����]
 * 
 * ���� X�� ����� �� �ִ� ������ ������ ���� �� ���� �̴�.
 * 
 * - X�� 3���� ������ ��������, 3���� ������.
 * - X�� 2�� ������ ��������, 2�� ������.
 * - 1�� ����.
 * 
 * ���� N�� �־����� ��, ���� ���� ���� �� ���� ������ ����ؼ� 1�� ������� �Ѵ�. ������ ����ϴ� Ƚ���� �ּҰ��� ����Ͻÿ�.
 * 
 * [�Է�]
 * ù° �ٿ� 1���� ũ�ų� ����, 106���� �۰ų� ���� �ڿ��� N�� �־�����.
 * 
 * [���]
 * ù° �ٿ� ������ �ϴ� Ƚ���� �ּҰ��� ����Ѵ�.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	Scanner s = new Scanner(System.in);

	int n = s.nextInt();

	int[] dp = new int[n + 1];

	dp[1] = 0;

	for (int i = 2; i <= n; i++) {

	    dp[i] = dp[i - 1] + 1;
	    if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1);
	    if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1);

	}

	System.out.println(dp[n]);

	s.close();

    }
}