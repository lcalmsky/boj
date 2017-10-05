
/*
 * https://www.acmicpc.net/problem/1152
 * 
 * [문제]
 * 영어 대소문자와 띄어쓰기만으로 이루어진 문장이 주어진다. 이 문장에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 단어는 띄어쓰기 하나로 구분된다고 생각한다.
 * 
 * [입력]
 * 첫 줄에 영어 대소문자와 띄어쓰기로 이루어진 문장이 주어진다. 이 문장의 길이는 1,000,000을 넘지 않는다.
 * 
 * [출력]
 * 첫째 줄에 단어의 개수를 출력한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String str = in.readLine();

		StringTokenizer st = new StringTokenizer(str);

		int cnt = 0;
		while (st.hasMoreTokens()) {
			st.nextToken();
			cnt++;
		}

		System.out.println(cnt);

		in.close();

	}
}