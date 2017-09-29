
/*
 * [문제]
 * 45656이란 수를 보자.
 * 이 수는 인접한 모든 자리수의 차이가 1이 난다. 이런 수를 계단 수라고 한다. 세준이는 수의 길이가 N인 계단 수가 몇 개 있는지 궁금해졌다. N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구하는
 * 프로그램을 작성하시오. (0으로 시작하는 수는 없다.)
 * 
 * [입력]
 * 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 100보다 작거나 같은 자연수이다.
 * 
 * [출력]
 * 첫째 줄에 정답을 1,000,000,000으로 나눈 나머지를 출력한다.
 * 
 */

/*
 * [풀이]
 * - n자리 수의 가장 큰 자리 수를 담을 수 있는 배열을 선언하고 한 자리 수 일 때 값을 초기화해줌
 * - 두 자리 수 일 때 부터 가장 큰 자리 수 뒤에 나올 수 있는 경우의 수를 더해주는 방식으로 진행
 * 
 * [점화식]
 * - dp[n][k] = dp[n-1][k-1] + dp[n-1][k+1]
 * 
 * [특이사항]
 * - 덧셈이므로 mod 연산을 미리 해주고 더해도 결과 값에 변함이 없음
 * 
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	Scanner s = new Scanner(System.in);

	int n = s.nextInt(), mod = 1000000000;
	long[][] dp = new long[n + 1][10];
	long sum = 0;

	for (int i = 1; i <= 9; i++) {
	    dp[1][i] = 1;
	}

	for (int i = 2; i <= n; i++) {

	    dp[i][0] = dp[i - 1][1] % mod;
	    dp[i][9] = dp[i - 1][8] % mod;

	    for (int j = 1; j <= 8; j++)
		dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % mod;
	}

	for (int i = 0; i <= 9; i++)
	    sum += dp[n][i] % mod;

	System.out.println(sum % mod);

	s.close();

    }
}