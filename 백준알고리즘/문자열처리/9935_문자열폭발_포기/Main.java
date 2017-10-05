
/*
 * [��ó]
 * https://www.acmicpc.net/problem/9935
 * 
 * [����]
 * ����̴� ���ڿ��� ���� ���ڿ��� �ɾ� ���Ҵ�. ���� ���ڿ��� �����ϸ� �� ���ڴ� ���ڿ����� �������, ���� ���ڿ��� �������� �ȴ�.
 * ������ ������ ���� �������� ����ȴ�.
 * 
 * ���ڿ��� ���� ���ڿ��� �����ϰ� �ִ� ��쿡, ��� ���� ���ڿ��� �����ϰ� �ȴ�. ���� ���ڿ��� ������� �̾� �ٿ� ���ο� ���ڿ��� �����.
 * ���� ���� ���ڿ��� ���� ���ڿ��� ���ԵǾ� ���� ���� �ִ�.
 * ������ ���� ���ڿ��� ���ڿ��� ���� ������ ��ӵȴ�.
 * ����̴� ��� ������ ���� �Ŀ� � ���ڿ��� ������ ���غ����� �Ѵ�. �����ִ� ���ڰ� ���� ��찡 �ִ�. �� ���� "FRULA"�� ����Ѵ�.
 * ���� ���ڿ��� ���� ���ڸ� �� �� �̻� �������� �ʴ´�.
 * 
 * [�Է�]
 * ù° �ٿ� ���ڿ��� �־�����. ���ڿ��� ���̴� 1���� ũ�ų� ����, 1,000,000���� �۰ų� ����.
 * ��° �ٿ� ���� ���ڿ��� �־�����. ���̴� 1���� ũ�ų� ����, 36���� �۰ų� ����.
 * �� ���ڿ��� ��� ���ĺ� �ҹ��ڿ� �빮��, ���� 0, 1, ..., 9�θ� �̷���� �ִ�.
 * 
 * [���]
 * ù° �ٿ� ��� ������ ���� �� ���� ���ڿ��� ����Ѵ�.
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String str = in.readLine(), bomb = in.readLine();
		char[] res = new char[str.length()];

		int i, j = 0, sl = str.length(), bl = bomb.length();

		for (i = 0; i <= sl - 2; i++) {
			int idx = res.length + j - bl;
			if (str.substring(idx, idx + bl).compareTo(bomb) == 0) j -= bl;
			res[j] = str.charAt(i);
			j++;
		}

		if (res.toString().isEmpty()) System.out.println("FRULA");
		else System.out.println(res.toString());

		in.close();

	}
}