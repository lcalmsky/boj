
/*
 * https://www.acmicpc.net/problem/1152
 * 
 * [����]
 * ���� ��ҹ��ڿ� ���⸸���� �̷���� ������ �־�����. �� ���忡�� �� ���� �ܾ ������? �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, �ܾ�� ���� �ϳ��� ���еȴٰ� �����Ѵ�.
 * 
 * [�Է�]
 * ù �ٿ� ���� ��ҹ��ڿ� ����� �̷���� ������ �־�����. �� ������ ���̴� 1,000,000�� ���� �ʴ´�.
 * 
 * [���]
 * ù° �ٿ� �ܾ��� ������ ����Ѵ�.
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