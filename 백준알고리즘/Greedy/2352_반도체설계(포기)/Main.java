
/*
 * https://www.acmicpc.net/problem/2352
 * 
 * 문제
 * 반도체를 설계할 때 n개의 포트를 다른 n개의 포트와 연결해야 할 때가 있다.
 * 
 * 예를 들어 왼쪽 그림이 n개의 포트와 다른 n개의 포트를 어떻게 연결해야 하는지를 나타낸다. 하지만 이와 같이 연결을 할 경우에는 연결선이 서로 꼬이기 때문에 이와 같이 연결할 수 없다. n개의 포트가 다른
 * n개의 포트와 어떻게 연결되어야 하는지가 주어졌을 때, 연결선이 서로 꼬이지(겹치지, 교차하지) 않도록 하면서 최대 몇 개까지 연결할 수 있는지를 알아내는 프로그램을 작성하시오
 * 
 * 입력
 * 첫째 줄에 정수 n(1≤n≤40,000)이 주어진다. 다음 줄에는 차례로 1번 포트와 연결되어야 하는 포트 번호, 2번 포트와 연결되어야 하는 포트 번호, …, n번 포트와 연결되어야 하는 포트 번호가
 * 주어진다. 이 수들은 1 이상 n 이하이며 서로 같은 수는 없다고 가정하자.
 * 
 * 출력
 * 첫째 줄에 최대 연결 개수를 출력한다.
 * 
 * 예제 입력 복사
 * 6
 * 4 2 6 3 1 5
 * 예제 출력 복사
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
