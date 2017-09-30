
/*
 * https://www.acmicpc.net/problem/11052
 * 
 * [����]
 * ���������� �ؾ ��縦 �ϰ� �ִ� �غ��̴� ���� �ؾ�� N�� ���Ҵ�.
 * �غ��̴� ������ �ؾ ��Ʈ �޴��� �����ؼ� �ؾ�� �ȾƼ� ���� �� �ִ� ������ �ִ�� ������� �Ѵ�. �ؾ ��Ʈ �޴��� �ؾ�� ��� �Ĵ� ���� �ǹ��ϰ�, ��Ʈ �޴��� ������ �̹� ������ �ִ�.
 * �ؾ i���� �̷���� ��Ʈ �޴��� ������ Pi ���̴�.
 * �ؾ�� 4�� ���� �ְ�, 1�� �� ���� ������ 1, 2���� 5, 3���� 6, 4���� 7�� ��쿡 �غ��̰� ���� �� �ִ� �ִ� ������ 10���̴�. 2��, 2���� �ؾ�� �ȸ� �Ǳ� �����̴�.
 * 1�� �� ���� ������ 5, 2���� 2, 3���� 8, 4���� 10 �� ��쿡�� 20�� �ȴ�. 1��, 1��, 1��, 1���� �ؾ�� �ȸ� �Ǳ� �����̴�.
 * ����������, 1�� �� ���� ������ 3, 2���� 5, 3���� 15, 4���� 16�� ��쿡�� ������ 18�̴�. �ؾ�� 3��, 1���� �ȸ� �Ǳ� �����̴�.
 * ��Ʈ �޴��� ������ �־����� ��, �غ��̰� ���� �� �ִ� �ִ� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * [�Է�]
 * ù° �ٿ� �غ��̰� ������ �ִ� �ؾ�� ���� N�� �־�����. (1 �� N �� 1,000)
 * ��° �ٿ��� Pi�� P1���� PN���� ������� �־�����. (1 �� Pi �� 10,000)
 * 
 * [���]
 * �غ��̰� ���� �� �ִ� �ִ� ������ ����Ѵ�.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.valueOf(in.readLine());
		int[] cost = new int[n + 1];
		int[] dp = new int[n + 1];

		String[] costStr = in.readLine().split(" ");
		for (int i = 1; i <= n; i++)
			cost[i] = Integer.valueOf(costStr[i - 1]);

		for (int i = 1; i <= n; i++)
			for (int j = i; j <= n; j++)
				dp[j] = dp[j] > dp[j - i] + cost[i] ? dp[j] : dp[j - i] + cost[i];

		System.out.println(dp[n]);

		in.close();
	}
}
// public static void main(String[] args) {
//
// Scanner s = new Scanner(System.in);
//
// int n = s.nextInt();
// int[] cost = new int[n + 1];
// int[] dp = new int[n + 1];
//
// for (int i = 1; i <= n; i++)
// cost[i] = s.nextInt();
//
// for (int i = 1; i <= n; i++)
// for (int j = i; j <= n; j++)
// dp[j] = dp[j] > dp[j - i] + cost[i] ? dp[j] : dp[j - i] + cost[i];
//
// System.out.println(dp[n]);
//
// s.close();
// }