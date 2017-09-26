package boj1005_acmcraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int t = s.nextInt();

		while (t-- > 0) {

			int n = s.nextInt();
			int k = s.nextInt();

			int[] buildTime = new int[n + 1];
			for (int i = 1; i <= n; i++)
				buildTime[i] = s.nextInt();

			List<List<Integer>> rules = new ArrayList<>(k + 1);
			for (int i = 1; i <= k; i++) {

				int pre = s.nextInt();
				int post = s.nextInt();
				rules.get(post).add(pre);

			}

			int w = s.nextInt();
			int total = 0;

			while (true) {

				int max = 0;
				for (int pre : rules.get(w))
					max = max > buildTime[pre] ? max : buildTime[pre];
				total += max;
			}

		}

		s.close();

	}
}