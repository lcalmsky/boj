
/*
 * https://www.acmicpc.net/problem/2749
 * 
 * ����
 * �Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�. �� ���� 2��° ���ʹ� �ٷ� �� ��
 * �Ǻ���ġ ���� ���� �ȴ�.
 * 
 * �̸� ������ �Ẹ�� Fn = Fn-1 + Fn-2 (n>=2)�� �ȴ�.
 * 
 * n=17�϶� ���� �Ǻ���ġ ���� �Ẹ�� ������ ����.
 * 
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
 * 
 * n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է�
 * ù° �ٿ� n�� �־�����. n�� 1,000,000,000,000,000,000���� �۰ų� ���� �ڿ����̴�.
 * 
 * ���
 * ù° �ٿ� n��° �Ǻ���ġ ���� 1,000,000���� ���� �������� ����Ѵ�.
 * 
 * ���� �Է� ����
 * 1000
 * ���� ��� ����
 * 228875
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		long n = s.nextLong();
		int mod = 1000000;
		int period = 15 * (int) Math.pow(10, 5);
		int[] dp = new int[period];

		dp[0] = 0;
		dp[1] = 1;

		for (int i = 2; i < period; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % mod;
		}

		System.out.println(dp[(int) (n%period)]);
		s.close();

	}
}