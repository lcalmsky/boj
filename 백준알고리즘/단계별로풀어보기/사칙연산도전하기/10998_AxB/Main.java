
/*
 * ����
 * �� ���� A�� B�� �Է¹��� ����, A*B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է�
 * ù° �ٿ� A�� B�� �־�����. (0 < A,B < 10)
 * 
 * ���
 * ù° �ٿ� A*B�� ����Ѵ�.
 * 
 * ���� �Է� ����
 * 1 2
 * ���� ��� ����
 * 2
 * ���� �Է� 2 ����
 * 3 4
 * ���� ��� 2 ����
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

		int A = Integer.valueOf(st.nextToken()), B = Integer.valueOf(st.nextToken());

		System.out.println(A * B);
		in.close();
	}

}
