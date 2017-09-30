
/*
 * https://www.acmicpc.net/problem/2167
 * 
 * [문제]
 * 2차원 배열이 주어졌을 때 (i, j) 위치부터 (x, y) 위치까지에 저장되어 있는 수들의 합을 구하는 프로그램을 작성하시오. 배열의 (i, j) 위치는 i행 j열을 나타낸다.
 * 
 * [입력]
 * 첫째 줄에 배열의 크기 N, M(1≤N, M≤300)이 주어진다. 다음 N개의 줄에는 M개의 정수로 배열이 주어진다. 그 다음 줄에는 합을 구할 부분의 개수 K(1≤K≤10,000)가 주어진다. 다음 K개의
 * 줄에는 네 개의 정수로 i, j, x, y가 주어진다(i≤x, j≤y).
 * 
 * [출력]
 * K개의 줄에 순서대로 배열의 합을 출력한다. 배열의 합은 32bit-int 범위를 초과하지 않는다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine();
		String[] nm = line.split(" ");

		int n = Integer.valueOf(nm[0]), m = Integer.valueOf(nm[1]);
		int[][] arr = new int[n + 1][m + 1];

		for (int i = 1; i <= n; i++) {
			line = in.readLine();
			String[] split = line.split(" ");
			for (int j = 1; j <= m; j++)
				arr[i][j] = Integer.valueOf(split[j - 1]);
		}

		int k = Integer.valueOf(in.readLine());

		while (k-- > 0) {

			line = in.readLine();
			String[] ijxy = line.split(" ");
			int i = Integer.valueOf(ijxy[0]), j = Integer.valueOf(ijxy[1]), x = Integer.valueOf(ijxy[2]), y = Integer.valueOf(ijxy[3]), sum = 0;
			for (int a = i; a <= x; a++)
				for (int b = j; b <= y; b++)
					sum += arr[a][b];

			System.out.println(sum);

		}

		in.close();

	}
}