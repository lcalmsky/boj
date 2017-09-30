package stringtransformation;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int t = scanner.nextInt();
		int[] alphabetCnt;

		for (int i = 0; i < t; i++) {

			int n = scanner.nextInt();

			String s = scanner.next();
			StringBuilder res = new StringBuilder();

			alphabetCnt = new int[26];

			for (int j = 0; j < n; j++) {

				char letter = s.charAt(j);
				char changedLetter = (char) (letter + alphabetCnt[letter - 'a']);
				changedLetter = changedLetter > 'z' ? (char) (changedLetter - 26) : changedLetter;
				res.append(changedLetter);
				// alphabetCnt[letter - 'a']++;
				alphabetCnt[letter - 'a']++;
				if (alphabetCnt[letter - 'a'] > 26) {
					alphabetCnt[letter - 'a'] = 1;
				}

			}

			System.out.println(res);

		}

		scanner.close();

	}
}
