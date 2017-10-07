
/*
 * https://www.acmicpc.net/problem/5585
 * 
 * ����
 * Ÿ�δ� ���� JOI��ȭ������ ������ ���. JOI��ȭ������ �ܵ����� 500��, 100��, 50��, 10��, 5��, 1���� ����� �ְ�, ������ �Ž����� ������ ���� ���� �ܵ��� �ش�. Ÿ�ΰ� JOI��ȭ������
 * ������ ��� ī���Ϳ��� 1000�� ���� ���� ���� ��, ���� �ܵ��� ���Ե� �ܵ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ���� ��� �Էµ� ��1�� ��쿡�� �Ʒ� �׸����� ó�� 4���� ����ؾ� �Ѵ�.
 * 
 * �Է�
 * �Է��� ���ٷ� �̷������, Ÿ�ΰ� ������ ��(1�� �̻� 1000�̸��� ����)�� 1���� �����ִ�.
 * 
 * ���
 * ������ ��� ������ 1�����θ� �Ǿ� �ִ�. �ܵ��� ���Ե� �ż��� ����Ͻÿ�.
 * 
 * ���� �Է� ����
 * 380
 * ���� ��� ����
 * 4
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int charge = 1000 - Integer.valueOf(in.readLine());
		int[] coins = { 500, 100, 50, 10, 5, 1 };

		int cnt = 0;
		for (int i = 0; i < coins.length; i++) {
			if (charge - coins[i] < 0) continue;
			cnt += charge / coins[i];
			charge %= coins[i];
			if (charge == 0) break;
		}

		System.out.println(cnt);

		in.close();

	}
}