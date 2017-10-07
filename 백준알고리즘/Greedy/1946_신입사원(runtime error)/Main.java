
/*
 * ����
 * ������ �ְ��� �����ϴ� ������ ���� ���� �ֽ�ȸ�簡 �ű� ��� ä���� �ǽ��Ѵ�. ���� ���� ������ 1�� �����ɻ�� 2�� ������������ �̷������. �ְ��� �����Ѵٴ� ����� �̳信 ���� �׵��� �ְ���
 * ����鸸�� ������� �����ϰ� �;� �Ѵ�.
 * 
 * �׷��� ���� �ֽ�ȸ���, �ٸ� ��� �����ڿ� ������ �� �����ɻ� ������ �������� ���� �� ��� �ϳ��� �ٸ� �����ں��� �������� �ʴ� �ڸ� �����Ѵٴ� ��Ģ�� ������. ��, � ������ A�� ������ �ٸ� �
 * ������ B�� ������ ���� ���� �ɻ� ����� ���� ������ ��� �������ٸ� A�� ���� ���ߵ��� �ʴ´�.
 * 
 * �̷��� ������ ������Ű�鼭, ���� �ֽ�ȸ�簡 �̹� �ű� ��� ä�뿡�� ������ �� �ִ� ���Ի���� �ִ� �ο����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է�
 * ù° �ٿ��� �׽�Ʈ ���̽��� ���� T(1��T��20)�� �־�����. �� �׽�Ʈ ���̽��� ù° �ٿ� �������� ���� N(1��N��100,000)�� �־�����. ��° �ٺ��� N�� �ٿ��� ������ �������� �����ɻ� ����, ����
 * ������ ������ ������ ���̿� �ΰ� �� �ٿ� �־�����. �� ���� ������ ��� 1������ N������ ������ ���� �����ȴٰ� �����Ѵ�.
 * 
 * ���
 * �� �׽�Ʈ ���̽��� ���ؼ� ���� �ֽ�ȸ�簡�� ������ �� �ִ� ���Ի���� �ִ� �ο����� �� �ٿ� �ϳ��� ����Ѵ�.
 * 
 * ���� �Է� ����
 * 2
 * 5
 * 3 2
 * 1 4
 * 4 1
 * 2 3
 * 5 5
 * 7
 * 3 6
 * 7 3
 * 4 2
 * 1 4
 * 5 7
 * 2 5
 * 6 1
 * ���� ��� ����
 * 4
 * 3
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.valueOf(in.readLine());

		int[] rank = new int[100001];

		for (int i = 0; i < t; i++) {

			int n = Integer.valueOf(in.readLine());

			for (int j = 0; j < n; j++) {

				StringTokenizer st = new StringTokenizer(in.readLine());
				int paper = Integer.valueOf(st.nextToken());
				int interview = Integer.valueOf(st.nextToken());
				rank[paper] = interview;

			}

			// ���� 1���� ���� ������ ����
			int min = rank[1];

			// 1���� �̹� �������� ī��Ʈ �� �÷���
			int cnt = 1;

			for (int j = 2; j <= n; j++) {

				if (min > rank[j]) { // �̹� ���� ����� ���� ������� �� ������

					cnt++; // ����
					min = rank[j]; // ���� ����� ���� ����� ������ ��

				}
			}

			System.out.println(cnt);

		}

		in.close();

	}
}