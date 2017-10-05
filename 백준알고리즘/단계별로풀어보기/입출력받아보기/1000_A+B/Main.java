
/*
 * https://www.acmicpc.net/problem/1000
 * 
 * 문제
 * 두 수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 
 * 입력
 * 첫째 줄에 A와 B가 주어진다. (0 < A,B < 10)
 * 
 * 출력
 * 첫째 줄에 A+B를 출력한다.
 * 
 * 예제 입력 복사
 * 1 2
 * 예제 출력 복사
 * 3
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

		System.out.println(A + B);
		in.close();

	}

}
