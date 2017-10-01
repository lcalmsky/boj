import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		System.out.println(getIntegerComplement(n));

		s.close();

	}

	static int getIntegerComplement(int n) {

		String complementStr = "";

		while (n != 0) {

			complementStr = (1 - n % 2) + complementStr;
			n /= 2;

		}

		int complement = 0;

		for (int i = complementStr.length() - 1, j = 0; i >= 0; i--, j++) {

			complement += (complementStr.charAt(i) - '0') * Math.pow(2, j);

		}

		return complement;
	}

}
