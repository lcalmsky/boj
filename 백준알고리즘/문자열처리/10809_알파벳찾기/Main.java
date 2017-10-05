
/*
 * [��ó]
 * https://www.acmicpc.net/problem/10809
 * 
 * [����]
 * ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * [�Է�]
 * ù° �ٿ� �ܾ� S�� �־�����. �ܾ��� ���̴� 100�� ���� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.
 * 
 * [���]
 * ������ ���ĺ��� ���ؼ�, a�� ó�� �����ϴ� ��ġ, b�� ó�� �����ϴ� ��ġ, ... z�� ó�� �����ϴ� ��ġ�� �������� �����ؼ� ����Ѵ�.
 * ����, � ���ĺ��� �ܾ ���ԵǾ� ���� �ʴٸ� -1�� ����Ѵ�. �ܾ��� ù ��° ���ڴ� 0��° ��ġ�̰�, �� ��° ���ڴ� 1��° ��ġ�̴�.
 * 
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String S = s.nextLine();
		int[] alphabet = new int[26];
		for (int i = 0; i < alphabet.length; i++)
			alphabet[i] = -1;

		for (int i = 0; i < S.length(); i++)
			if (alphabet[S.charAt(i) - 'a'] == -1) alphabet[S.charAt(i) - 'a'] = i;

		for (int i = 0; i < alphabet.length; i++)
			System.out.print(alphabet[i] + " ");

		s.close();

	}
}