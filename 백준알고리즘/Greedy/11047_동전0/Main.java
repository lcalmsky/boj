
/*
 * [��ó]
 * https://www.acmicpc.net/problem/11047
 * 
 * [����]
 * �ر԰� ������ �ִ� ������ �� N�����̰�, ������ ������ �ſ� ���� ������ �ִ�.
 * ������ ������ ����ؼ� �� ��ġ�� ���� K�� ������� �Ѵ�. �� �� �ʿ��� ���� ������ �ּҰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * [�Է�]
 * ù° �ٿ� N�� K�� �־�����. (1 �� N �� 10, 1 �� K �� 100,000,000)
 * ��° �ٺ��� N���� �ٿ� ������ ��ġ Ai�� ������������ �־�����. (1 �� Ai �� 1,000,000, A1 = 1, i �� 2�� ��쿡 Ai�� Ai-1�� ���)
 * 
 * [���]
 * ù° �ٿ� K���� ����µ� �ʿ��� ���� ������ �ּҰ��� ����Ѵ�.
 * 
 * [���� �Է�]
 * 10 4200
 * 1
 * 5
 * 10
 * 50
 * 100
 * 500
 * 1000
 * 5000
 * 10000
 * 50000
 * [���� ���]
 * 6
 * [���� �Է� 2]
 * 10 4790
 * 1
 * 5
 * 10
 * 50
 * 100
 * 500
 * 1000
 * 5000
 * 10000
 * 50000
 * [���� ��� 2]
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

		int n = Integer.valueOf(st.nextToken()), k = Integer.valueOf(st.nextToken()), cnt = 0;
		int[] coin = new int[n];

		for (int i = coin.length - 1; i >= 0; i--)
			coin[i] = Integer.valueOf(in.readLine());

		for (int i = 0; i < coin.length; i++) {

			cnt += k / coin[i];
			k %= coin[i];

		}

		System.out.println(cnt);

		in.close();

	}
	// public static void main(String[] args) throws IOException {
	//
	// BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//
	// StringTokenizer st = new StringTokenizer(in.readLine());
	//
	// int n = Integer.valueOf(st.nextToken()), k = Integer.valueOf(st.nextToken());
	// int[] coin = new int[n];
	//
	// for (int i = coin.length - 1; i >= 0; i--)
	// coin[i] = Integer.valueOf(in.readLine());
	//
	// int cnt = 0;
	// for (int i = 0; i < coin.length; i++) {
	//
	// if (coin[i] > k) continue;
	//
	// while (k != 0) {
	// if (k - coin[i] < 0) break;
	// k -= coin[i];
	// cnt++;
	// }
	// }
	//
	// System.out.println(cnt);
	//
	// in.close();
	//
	// }
}