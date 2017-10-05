
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String[] croatiaAlphbet = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		String str = s.next();

		for (String ca : croatiaAlphbet) if (str.contains(ca)) str = str.replace(ca, "1");

		System.out.println(str.length());

		s.close();

	}
}