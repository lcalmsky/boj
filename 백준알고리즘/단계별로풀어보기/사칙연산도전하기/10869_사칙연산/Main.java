
/*
 * 문제
 * 두 자연수 A와 B가 주어진다. 이 때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
 * 
 * 입력
 * 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
 * 
 * 출력
 * 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
 * 
 * 예제 입력 복사
 * 7 3
 * 예제 출력 복사
 * 10
 * 4
 * 21
 * 2
 * 1
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

		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
		System.out.println(A / B);
		System.out.println(A % B);
		in.close();
	}

}
