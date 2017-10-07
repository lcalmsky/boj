
/*
 * ����
 * A/B�� ����Ͻÿ�.
 * 
 * �Է�
 * ù° �ٿ� A�� B�� �־�����. (0 < A,B < 10)
 * 
 * ���
 * ù° �ٿ� A/B�� ����Ѵ�. ����/��� ������ 10-9 ���� ����Ѵ�.
 * 
 * ���� �Է� ����
 * 1 3
 * ���� ��� ����
 * 0.33333333333333333333333333333333
 * ���� �Է� 2 ����
 * 4 5
 * ���� ��� 2 ����
 * 0.8
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		double A = Double.valueOf(st.nextToken()), B = Double.valueOf(st.nextToken());

		System.out.println(A / B);
		in.close();
	}

}
