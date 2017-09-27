package boj10828_����;

/**
 * https://www.acmicpc.net/problem/10828
 * 
 * ����
������ �����ϴ� ������ ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.

����� �� �ټ� �����̴�.

push X: ���� X�� ���ÿ� �ִ� �����̴�.
pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
�Է�
ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����. �־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����. ������ �������� ���� ����� �־����� ���� ����.

���
����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		List<Integer> stack = new ArrayList<>();

		while (n-- > 0) {

			String command = s.next();
			int value = "push".equals(command) ? s.nextInt() : 0;

			switch (command) {
			case "push": {

				stack.add(value);
				break;

			}
			case "pop": {

				System.out.println(stack.isEmpty() ? -1 : stack.remove(stack.size() - 1));
				break;

			}
			case "size": {

				System.out.println(stack.size());
				break;

			}
			case "empty": {

				System.out.println(stack.isEmpty() ? 1 : 0);
				break;

			}
			case "top": {

				System.out.println(stack.isEmpty() ? -1 : stack.get(stack.size() - 1));
				break;

			}
			}
		}

		s.close();

	}
}