package 뉴스클러스터링;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public int solution(String str1, String str2) {
		int answer = 0;

		String first = str1.toLowerCase();
		String second = str2.toLowerCase();

		first = first.replaceAll("[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]", "");
		second = second.replaceAll("[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]", "");

		Set<String> sumSet = new HashSet<>();

		Set<String> firstSet = new HashSet<>();
		for (int i = 0; i < first.length() - 1; i++) {
			String letter = first.substring(i, i + 1);
			firstSet.add(letter);
			sumSet.add(letter);
		}

		Set<String> secondSet = new HashSet<>();
		for (int i = 0; i < second.length() - 1; i++) {
			String letter = second.substring(i, i + 1);
			secondSet.add(letter);
			sumSet.add(letter);
		}
		
		Set<String> inter = new HashSet<>();
		for (String fLetter : firstSet) {
			for (String sLetter : secondSet) {
				
			}
		}

		return answer;
	}

}
