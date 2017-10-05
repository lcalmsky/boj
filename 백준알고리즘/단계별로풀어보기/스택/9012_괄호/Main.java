import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int t = s.nextInt();

		while (t-- > 0) {

			String ps = s.next();

			int valid = 0;

			if (ps.startsWith(")") || ps.endsWith("(")) {

				System.out.println("NO");
				continue;

			}

			for (int i = 0; i < ps.length(); i++) {

				valid += (ps.charAt(i) == '(' ? 1 : -1);
				if (valid < 0)
					break;

			}

			System.out.println(valid == 0 ? "YES" : "NO");

		}

		s.close();

	}
}