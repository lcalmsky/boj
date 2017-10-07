
/*
 * https://www.acmicpc.net/problem/10610
 * 
 * 문제
 * 어느날, 미르코는 우연히 길거리에서 양수 N을 보았다. 미르코는 30이란 수를 존경하기 때문에, 그는 길거리에서 찾은 수에 포함된 숫자들을 섞어 30의 배수가 되는 가장 큰 수를 만들고 싶어한다.
 * 미르코를 도와 그가 만들고 싶어하는 수를 계산하는 프로그램을 작성하라. (그 수가 존재한다면)
 * 
 * 입력
 * N을 입력받는다. N는 최대 10^5개의 숫자로 구성되어 있다.
 * 
 * 출력
 * 미르코가 만들고 싶어하는 수가 존재한다면 그 수를 출력하라. 그 수가 존재하지 않는다면, -1을 출력하라.
 * 
 * 예제 입력 복사
 * 30
 * 예제 출력 복사
 * 30
 * 예제 입력 2 복사
 * 102
 * 예제 출력 2 복사
 * 210
 * 예제 입력 3 복사
 * 2931
 * 예제 출력 3 복사
 * -1
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String n = in.readLine();
		int[] numbers = new int[10];
		int sum = 0;
		for (int i = 0; i < n.length(); i++) {
			int num = n.charAt(i) - '0';
			numbers[num]++;
			sum += num;
		}

		if (numbers[0] == 0 || sum % 3 != 0) System.out.println(-1);
		else {
			StringBuilder sb = new StringBuilder();
			for (int i = numbers.length - 1; i >= 0; i--)
				while (numbers[i]-- > 0)
					sb.append(i);
			System.out.println(sb);
		}

		in.close();

	}
}