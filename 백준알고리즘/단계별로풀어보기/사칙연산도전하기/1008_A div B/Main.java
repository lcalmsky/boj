
/*
 * 문제
 * A/B를 계산하시오.
 * 
 * 입력
 * 첫째 줄에 A와 B가 주어진다. (0 < A,B < 10)
 * 
 * 출력
 * 첫째 줄에 A/B를 출력한다. 절대/상대 오차는 10-9 까지 허용한다.
 * 
 * 예제 입력 복사
 * 1 3
 * 예제 출력 복사
 * 0.33333333333333333333333333333333
 * 예제 입력 2 복사
 * 4 5
 * 예제 출력 2 복사
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
