
/*
 * ��Ÿ�� ���� Ǯ��
 * ������
 * �ð� ���� �޸� ���� ���� ���� ���� ��� ���� ����
 * 2 �� 128 MB 3751 1073 898 29.346%
 * ����
 * �������� �������� ��Ÿ �÷��̾��̴�. �����ϰԵ� N���� ���� ��������. ���� ���ο� ���� ��ų� ��ü�ؾ� �Ѵ�. �������� ��Ÿ����Ʈ�� �������� �ǵ����̸� ���� ���Ծ����� �Ѵ�. �������� 6�� ��Ű���� �� ����
 * ������, 1�� �Ǵ� �� �̻��� ���� ������ �� ���� �ִ�.
 * 
 * ������ ��Ÿ ���� ���� N�� ��Ÿ�� �귣�� M���� �־�����, ������ �귣�忡�� �Ĵ� ��Ÿ�� 6���� ����ִ� ��Ű���� ����, ������ �� ���� ������ �־��� ��, ��� N���� ��� ���� �ʿ��� ���� ���� �ּҷ�
 * �ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է�
 * ù° �ٿ� N�� M�� �־�����. N�� 100���� �۰ų� ���� �ڿ����̰�, M�� 50���� �۰ų� ���� �ڿ����̴�. ��° �ٺ��� M���� �ٿ��� �� �귣���� ��Ű�� ���ݰ� ������ ������ �������� �����Ͽ� �־�����.
 * ������ 0���� ũ�ų� ����, 1,000���� �۰ų� ���� �ڿ����̴�.
 * 
 * ���
 * ù° �ٿ� �������� ��Ÿ���� ��� N�� ��� ���� �ʿ��� ���� �ּڰ��� ����Ѵ�.
 * 
 * ���� �Է� ����
 * 4 2
 * 12 3
 * 15 4
 * ���� ��� ����
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