
/*
 * ����
 * (A+B)%C�� (A%C + B%C)%C �� ������?
 * 
 * (A��B)%C�� (A%C �� B%C)%C �� ������?
 * 
 * �� �� A, B, C�� �־����� ��, ���� �װ��� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է�
 * ù° �ٿ� A, B, C�� ������� �־�����. (2 �� A, B, C �� 10000)
 * 
 * ���
 * ù° �ٿ� (A+B)%C, ��° �ٿ� (A%C + B%C)%C, ��° �ٿ� (A��B)%C, ��° �ٿ� (A%C �� B%C)%C�� ����Ѵ�.
 * 
 * ���� �Է� ����
 * 5 8 4
 * ���� ��� ����
 * 1
 * 1
 * 0
 * 0
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		int A = Integer.valueOf(st.nextToken()), B = Integer.valueOf(st.nextToken()),
				C = Integer.valueOf(st.nextToken());

		System.out.println((A + B) % C);
		System.out.println((A % C + B % C) % C);
		System.out.println((A * B) % C);
		System.out.println((A % C * B % C) % C);
		in.close();
	}

}
