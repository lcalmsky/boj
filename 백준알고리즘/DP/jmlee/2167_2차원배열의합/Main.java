
/*
 * https://www.acmicpc.net/problem/2167
 * 
 * [����]
 * 2���� �迭�� �־����� �� (i, j) ��ġ���� (x, y) ��ġ������ ����Ǿ� �ִ� ������ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. �迭�� (i, j) ��ġ�� i�� j���� ��Ÿ����.
 * 
 * [�Է�]
 * ù° �ٿ� �迭�� ũ�� N, M(1��N, M��300)�� �־�����. ���� N���� �ٿ��� M���� ������ �迭�� �־�����. �� ���� �ٿ��� ���� ���� �κ��� ���� K(1��K��10,000)�� �־�����. ���� K����
 * �ٿ��� �� ���� ������ i, j, x, y�� �־�����(i��x, j��y).
 * 
 * [���]
 * K���� �ٿ� ������� �迭�� ���� ����Ѵ�. �迭�� ���� 32bit-int ������ �ʰ����� �ʴ´�.
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