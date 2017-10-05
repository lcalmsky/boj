package 단어공부_성공;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String str = s.nextLine();

		str = str.toLowerCase();

		int[][] ascii = new int[26][2];
		for (int i = 0; i < ascii.length; i++) {
			ascii[i][0] = 0;
			ascii[i][1] = i;
		}

		for (char c : str.toCharArray()) {

			ascii[c - 97][0]++;

		}

		int temp = 0;
		int tempIdx = 0;
		for (int i = 0; i < ascii.length - 1; i++) {
			for (int j = i + 1; j < ascii.length; j++) {
				if (ascii[j][0] > ascii[i][0]) {
					temp = ascii[i][0];
					tempIdx = ascii[i][1];
					ascii[i][0] = ascii[j][0];
					ascii[i][1] = ascii[j][1];
					ascii[j][0] = temp;
					ascii[j][1] = tempIdx;
				}
			}
		}

		if (ascii[0][0] == ascii[1][0])
			System.out.println("?");
		else
			System.out.println(((char) (ascii[0][1] + 65)));

		s.close();

	}
}
