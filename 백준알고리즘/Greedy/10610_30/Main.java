
/*
 * https://www.acmicpc.net/problem/10610
 * 
 * ����
 * �����, �̸��ڴ� �쿬�� ��Ÿ����� ��� N�� ���Ҵ�. �̸��ڴ� 30�̶� ���� �����ϱ� ������, �״� ��Ÿ����� ã�� ���� ���Ե� ���ڵ��� ���� 30�� ����� �Ǵ� ���� ū ���� ����� �;��Ѵ�.
 * �̸��ڸ� ���� �װ� ����� �;��ϴ� ���� ����ϴ� ���α׷��� �ۼ��϶�. (�� ���� �����Ѵٸ�)
 * 
 * �Է�
 * N�� �Է¹޴´�. N�� �ִ� 10^5���� ���ڷ� �����Ǿ� �ִ�.
 * 
 * ���
 * �̸��ڰ� ����� �;��ϴ� ���� �����Ѵٸ� �� ���� ����϶�. �� ���� �������� �ʴ´ٸ�, -1�� ����϶�.
 * 
 * ���� �Է� ����
 * 30
 * ���� ��� ����
 * 30
 * ���� �Է� 2 ����
 * 102
 * ���� ��� 2 ����
 * 210
 * ���� �Է� 3 ����
 * 2931
 * ���� ��� 3 ����
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