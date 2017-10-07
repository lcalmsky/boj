
/*
 * 문제
 * A+B를 계산하시오.
 * 
 * 입력
 * 첫째 줄에 A, 둘째 줄에 B가 주어진다. (0 < A, B < 10)
 * 
 * 
 * 
 * 출력
 * 첫째 줄에 A+B를 출력한다. (A+B < 10)
 * 
 * 예제 입력 복사
 * 1
 * 2
 * 예제 출력 복사
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
