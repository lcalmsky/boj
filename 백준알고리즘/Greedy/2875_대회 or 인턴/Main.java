
/*
 * https://www.acmicpc.net/problem/2875
 * 
 * ����
 * ���ش��б������� ��ȸ�� ���� �� 2���� ���л��� 1���� ���л��� ���� �Ἲ�ؼ� ������ ���� ��Ģ�̴�. (�������� ����Բ� ���޾�� ���� ���ڴ�.)
 * 
 * ���ش��б��� �پ ������� ���� ���ؿ��� N���� ���л��� M���� ���л��� ������ ã�� �ִ�.
 * 
 * �׷��� ���ؿ��� ��ȸ�� �����Ϸ��� �л��� �� K���� �ݵ�� ���Ͻ� ���α׷��� �����϶�� �б��� ��ħ�� ����� �Ǿ���.
 * 
 * ���ش��б������� �پ ������� ���� ������, ���� ���� ����� ���� �ּ��̴�.
 * 
 * �������� N���� ���л��� M���� ���л�, K���� ���Ͻ��� �����ؾ��ϴ� �ο��� �־��� �� ���� �� �ִ� �ִ��� �� ���� ���ϸ� �ȴ�.
 * 
 * �Է�
 * ù° �ٿ� N, M, K�� ������� �־�����. (0 �� M �� 100), (0 �� N �� 100), (0 �� K �� M+N),
 * 
 * ���
 * ���� �� �ִ� ���� �ִ밪�� ����ϸ� �ȴ�.
 * 
 * ���� �Է� ����
 * 6 3 2
 * ���� ��� ����
 * 2
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(in.readLine());

		int n = Integer.valueOf(st.nextToken()), m = Integer.valueOf(st.nextToken()), k = Integer.valueOf(st.nextToken());

		int team = 0;
		for (int i = 0; i <= k; i++) {
			int women = n - (k - i);
			int men = m - (k - (k - i));
			if (women < 2 || men < 1) continue;
			team = Math.max(team, women >= men * 2 ? men : women / 2);
		}

		System.out.println(team);

		in.close();

	}
}