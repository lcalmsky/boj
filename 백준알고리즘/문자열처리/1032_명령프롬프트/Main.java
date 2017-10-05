
/*
 * [��ó]
 * https://www.acmicpc.net/problem/1032
 * 
 * [����]
 * ���� -> ���� -> cmd�� �ĺ���. ���� ȭ���� ���� ���δ�. ���⼭ dir�̶�� ġ�� �� ���丮�� �ִ� ������丮�� ������ ��� ���´�. �� �� ���ϴ� ������ ã������ ������ ���� �ϸ� �ȴ�.
 * 
 * dir *.exe��� ġ�� Ȯ���ڰ� exe�� ������ �� ���´�. "dir ����"�� ���� ġ�� �� ���Ͽ� �´� ���ϸ� �˻� ����� ���´�. ���� ���, dir a?b.exe��� �˻��ϸ� ���ϸ��� ù ��° ���ڰ�
 * a�̰�, �� ��° ���ڰ� b�̰�, Ȯ���ڰ� exe�� ���� ��� ���´�. �� �� �� ��° ���ڴ� �ƹ��ų� ���͵� �ȴ�. ���� ���, acb.exe, aab.exe, apb.exe�� ���´�.
 * 
 * �� ������ �˻� ����� ���� �־����� ��, �������� �� �ľ� �� ����� ���������� ����ϴ� �����̴�. ���Ͽ��� ���ĺ��� "." �׸��� "?"�� ���� �� �ִ�. �����ϸ� ?�� ���� ��� �Ѵ�. �� ���丮����
 * �˻� ����� ���� ���ϸ� �ִٰ� �����ϰ�, ���� �̸��� ���̴� ��� ����.
 * 
 * [�Է�]
 * ù° �ٿ� ���� �̸��� ���� N�� �־�����. ��° �ٺ��� N���� �ٿ��� ���� �̸��� �־�����. N�� 50���� �۰ų� ���� �ڿ����̰� ���� �̸��� ���̴� ��� ���� ���̴� �ִ� 50�̴�. �����̸��� ���ĺ���
 * "." �׸��� "?"�θ� �̷���� �ִ�.
 * 
 * [���]
 * ù°�ٿ� ������ ����ϸ� �ȴ�.
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.valueOf(in.readLine());

		String[] filenames = new String[n];

		for (int i = 0; i < n; i++) filenames[i] = in.readLine();

		String standard = filenames[0];
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < standard.length(); i++) {
			
			char c = standard.charAt(i);
			boolean isMatched = true;
			for (int j = 1; j < filenames.length; j++) if (c != filenames[j].charAt(i)) isMatched = false;
			
			if (isMatched) result.append(c);
			else result.append("?");
			
		}

		System.out.println(result);

		in.close();

	}
}