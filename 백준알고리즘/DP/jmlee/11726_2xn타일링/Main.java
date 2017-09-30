import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int mod = 10007;
		int[] dp = new int[1001];

		dp[1] = 1;
		dp[2] = 2;

		for (int i = 3; i <= n; i++) {
			dp[i] = (dp[i - 1] % mod + dp[i - 2] % mod) % mod;
		}
		
		System.out.println(dp[n] % mod);

		s.close();

	}
}