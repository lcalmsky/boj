
/*
 * 기타줄 성공 풀이
 * 문제집
 * 시간 제한 메모리 제한 제출 정답 맞은 사람 정답 비율
 * 2 초 128 MB 3751 1073 898 29.346%
 * 문제
 * 김지민은 세계적인 기타 플레이어이다. 불행하게도 N개의 줄이 끊어졌다. 따라서 새로운 줄을 사거나 교체해야 한다. 세계적인 기타리스트인 김지민은 되도록이면 돈을 적게쓰려고 한다. 김지민은 6줄 패키지를 살 수도
 * 있지만, 1개 또는 그 이상의 줄을 낱개로 살 수도 있다.
 * 
 * 끊어진 기타 줄의 개수 N과 기타줄 브랜드 M개가 주어지고, 각각의 브랜드에서 파는 기타줄 6개가 들어있는 패키지의 가격, 낱개로 살 때의 가격이 주어질 때, 적어도 N개를 사기 위해 필요한 돈의 수를 최소로
 * 하는 프로그램을 작성하시오.
 * 
 * 입력
 * 첫째 줄에 N과 M이 주어진다. N은 100보다 작거나 같은 자연수이고, M은 50보다 작거나 같은 자연수이다. 둘째 줄부터 M개의 줄에는 각 브랜드의 패키지 가격과 낱개의 가격이 공백으로 구분하여 주어진다.
 * 가격은 0보다 크거나 같고, 1,000보다 작거나 같은 자연수이다.
 * 
 * 출력
 * 첫째 줄에 김지민이 기타줄을 적어도 N개 사기 위해 필요한 돈의 최솟값을 출력한다.
 * 
 * 예제 입력 복사
 * 4 2
 * 12 3
 * 15 4
 * 예제 출력 복사
 * 12
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(in.readLine());

		int n = Integer.valueOf(st.nextToken()), m = Integer.valueOf(st.nextToken()), p, s, lp = 1000, ls = 1000;

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(in.readLine());
			p = Integer.valueOf(st.nextToken());
			s = Integer.valueOf(st.nextToken());
			lp = lp < p ? lp : p;
			ls = ls < s ? ls : s;
		}

		if (lp >= ls * 6) System.out.println(n * ls);
		else System.out.println(lp * (n / 6) + (Math.min(lp, (n % 6) * ls)));

		in.close();

	}
}