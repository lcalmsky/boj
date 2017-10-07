
/*
 * 문제
 * (A+B)%C는 (A%C + B%C)%C 와 같을까?
 * 
 * (A×B)%C는 (A%C × B%C)%C 와 같을까?
 * 
 * 세 수 A, B, C가 주어졌을 때, 위의 네가지 값을 구하는 프로그램을 작성하시오.
 * 
 * 입력
 * 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
 * 
 * 출력
 * 첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.
 * 
 * 예제 입력 복사
 * 5 8 4
 * 예제 출력 복사
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
