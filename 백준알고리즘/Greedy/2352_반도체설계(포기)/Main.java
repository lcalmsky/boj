
/*
 * https://www.acmicpc.net/problem/2352
 * 
 * ����
 * �ݵ�ü�� ������ �� n���� ��Ʈ�� �ٸ� n���� ��Ʈ�� �����ؾ� �� ���� �ִ�.
 * 
 * ���� ��� ���� �׸��� n���� ��Ʈ�� �ٸ� n���� ��Ʈ�� ��� �����ؾ� �ϴ����� ��Ÿ����. ������ �̿� ���� ������ �� ��쿡�� ���ἱ�� ���� ���̱� ������ �̿� ���� ������ �� ����. n���� ��Ʈ�� �ٸ�
 * n���� ��Ʈ�� ��� ����Ǿ�� �ϴ����� �־����� ��, ���ἱ�� ���� ������(��ġ��, ��������) �ʵ��� �ϸ鼭 �ִ� �� ������ ������ �� �ִ����� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�
 * 
 * �Է�
 * ù° �ٿ� ���� n(1��n��40,000)�� �־�����. ���� �ٿ��� ���ʷ� 1�� ��Ʈ�� ����Ǿ�� �ϴ� ��Ʈ ��ȣ, 2�� ��Ʈ�� ����Ǿ�� �ϴ� ��Ʈ ��ȣ, ��, n�� ��Ʈ�� ����Ǿ�� �ϴ� ��Ʈ ��ȣ��
 * �־�����. �� ������ 1 �̻� n �����̸� ���� ���� ���� ���ٰ� ��������.
 * 
 * ���
 * ù° �ٿ� �ִ� ���� ������ ����Ѵ�.
 * 
 * ���� �Է� ����
 * 6
 * 4 2 6 3 1 5
 * ���� ��� ����
 * 3
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.valueOf(in.readLine());
		StringTokenizer st = new StringTokenizer(in.readLine());
		int[] port = new int[n + 1], dp = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			port[i] = Integer.valueOf(st.nextToken());
			dp[i] = 1;
		}

		int max = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++)
				if (port[i] > port[j] && dp[i] < dp[j] + 1) dp[i] = dp[j] + 1;
			max = Math.max(max, dp[i]);
		}

		System.out.println(dp[n]);

		in.close();
	}
}
// O(N^2)
// public static void main(String[] args) throws IOException {
//
// BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//
// int n = Integer.valueOf(in.readLine()), i;
// StringTokenizer st = new StringTokenizer(in.readLine());
// int[] port = new int[n + 1], dp = new int[n + 1];
//
// for (i = 1; i <= n; i++)
// port[i] = Integer.valueOf(st.nextToken());
//
// for (i = 1; i <= n; i++) {
// if (dp[i] == 0) dp[i] = 1;
// for (int j = 1; j < i; j++) {
// if (port[i] > port[j]) if (dp[i] < dp[j] + 1) dp[i] = dp[j] + 1;
// }
// }
//
// System.out.println(dp[n]);
//
// in.close();
// }
