
/*
 * https://www.acmicpc.net/problem/1001
 * 
 * ����
 * A-B�� ����Ͻÿ�.
 * 
 * �Է�
 * ù° �ٿ� A�� B�� �־�����. (0< A,B < 10)
 * 
 * ���
 * ù° �ٿ� A-B�� ����Ѵ�.
 * 
 * ���� �Է� ����
 * 3 2
 * ���� ��� ����
 * 1
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		int A = Integer.valueOf(st.nextToken()), B = Integer.valueOf(st.nextToken());

		System.out.println(A - B);
		in.close();

	}

}
