
/*
 * ����
 * A+B�� ����Ͻÿ�.
 * 
 * �Է�
 * ù° �ٿ� A, ��° �ٿ� B�� �־�����. (0 < A, B < 10)
 * 
 * 
 * 
 * ���
 * ù° �ٿ� A+B�� ����Ѵ�. (A+B < 10)
 * 
 * ���� �Է� ����
 * 1
 * 2
 * ���� ��� ����
 * 3
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.valueOf(in.readLine());
		int B = Integer.valueOf(in.readLine());

		System.out.println(A + B);
		in.close();
	}

}
