
/*
 * https://www.acmicpc.net/problem/5585
 * 
 * 문제
 * 타로는 자주 JOI잡화점에서 물건을 산다. JOI잡화점에는 잔돈으로 500엔, 100엔, 50엔, 10엔, 5엔, 1엔이 충분히 있고, 언제나 거스름돈 갯수가 가장 적게 잔돈을 준다. 타로가 JOI잡화점에서
 * 물건을 사고 카운터에서 1000엔 지폐를 한장 냈을 때, 받을 잔돈에 포함된 잔돈의 갯수를 구하는 프로그램을 작성하시오.
 * 예를 들어 입력된 예1의 경우에는 아래 그림에서 처럼 4개를 출력해야 한다.
 * 
 * 입력
 * 입력은 한줄로 이루어졌고, 타로가 지불할 돈(1개 이상 1000미만의 정수)이 1개만 쓰여있다.
 * 
 * 출력
 * 제출할 출력 파일은 1행으로만 되어 있다. 잔돈에 포함된 매수를 출력하시오.
 * 
 * 예제 입력 복사
 * 380
 * 예제 출력 복사
 * 4
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int charge = 1000 - Integer.valueOf(in.readLine());
		int[] coins = { 500, 100, 50, 10, 5, 1 };

		int cnt = 0;
		for (int i = 0; i < coins.length; i++) {
			if (charge - coins[i] < 0) continue;
			cnt += charge / coins[i];
			charge %= coins[i];
			if (charge == 0) break;
		}

		System.out.println(cnt);

		in.close();

	}
}