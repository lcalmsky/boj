
/*
 * [��ó]
 * https://www.acmicpc.net/problem/2217
 * 
 * [����]
 * N(1��N��100,000)���� ������ �ִ�. �� ������ �̿��Ͽ� �̷� ���� ��ü�� ���ø� �� �ִ�. ������ ������ �� ���⳪ ���̰� �ٸ��� ������ �� �� �ִ� ��ü�� �߷��� ���� �ٸ� ���� �ִ�.
 * ������ ���� ���� ������ ���ķ� �����ϸ� ������ ������ �ɸ��� �߷��� ���� �� �ִ�. k���� ������ ����Ͽ� �߷��� w�� ��ü�� ���ø� ��, ������ �������� ��� ���� w/k ��ŭ�� �߷��� �ɸ��� �ȴ�.
 * �� �����鿡 ���� ������ �־����� ��, �� �������� �̿��Ͽ� ���ø� �� �ִ� ��ü�� �ִ� �߷��� ���س��� ���α׷��� �ۼ��Ͻÿ�. ��� ������ ����ؾ� �� �ʿ�� ������, ���Ƿ� �� ���� ������ ��� ����ص�
 * �ȴ�. ��, ������ ������ �� ������ �����Ѵ�.
 * 
 * [�Է�]
 * ù° �ٿ� ���� N�� �־�����. ���� N���� �ٿ��� �� ������ ��ƿ �� �ִ� �ִ� �߷��� �־�����. �� ���� 10,000�� ���� �ʴ´�.
 * 
 * [���]
 * ù° �ٿ� ���� ����Ѵ�.
 * 
 * [���� �Է�] ����
 * 2
 * 10
 * 15
 * 
 * [���� ���] ����
 * 20
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(in.readLine()), max = 0;
		int lope[] = new int[n];

		for (int i = 0; i < n; i++)
			lope[i] = Integer.valueOf(in.readLine());

		Arrays.sort(lope);

		for (int i = 0; i < n; i++)
			max = Math.max(max, lope[i] * (n - i));

		System.out.println(max);

		in.close();

	}
}