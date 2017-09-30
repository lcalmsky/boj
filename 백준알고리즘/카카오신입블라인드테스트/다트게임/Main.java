package 다트게임;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public int solution(String dartResult) {

		int answer = 0;

		String[] score = dartResult.split("S|D|T|\\*|#");
		String[] operator = dartResult.split("[0-9]");

		List<Integer> scoreList = new ArrayList<>();
		for (String s : score) {
			if (!s.isEmpty()) {
				scoreList.add(Integer.valueOf(s));
			}

		}

		List<String> operatorList = new ArrayList<>();
		for (String o : operator) {
			if (!o.isEmpty()) {
				operatorList.add(o);
			}
		}

		int[] ans = new int[scoreList.size()];

		for (int i = 0; i < operatorList.size(); i++) {
			String op = operatorList.get(i);
			int num = scoreList.get(i);

			boolean isStarPrize = op.contains("*");
			boolean isAchaPrize = op.contains("#");

			op = op.replaceAll("\\*", "").replaceAll("#", "");

			switch (op) {
			case "S":
				ans[i] = num;
				break;
			case "D":
				ans[i] = (int) (Math.pow(num, 2.0));
				break;
			case "T":
				ans[i] = (int) (Math.pow(num, 3.0));
				break;
			}

			if (isStarPrize) {
				ans[i] *= 2;
				if (i != 0) {
					ans[i - 1] *= 2;
				}
			}
			if (isAchaPrize) {
				ans[i] *= -1;
			}
		}

		for (int i = 0; i < ans.length; i++) {
			answer += ans[i];
		}

		return answer;
	}

}
