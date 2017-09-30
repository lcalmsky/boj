package arrangetheword;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println(arrange(s.nextLine()));

		s.close();

	}

	static String arrange(String sentence) {

		sentence = sentence.toLowerCase().replace(".", "");

		String[] splitedSentence = sentence.split(" ");
		List<String> splitedSentenceList = Arrays.asList(splitedSentence);
		splitedSentenceList.sort((s1, s2) -> s1.length() - s2.length());

		String firstWord = splitedSentenceList.get(0);
		String firstLetter = firstWord.substring(0, 1);
		
		firstLetter = firstLetter.toUpperCase();
		firstWord = firstLetter + firstWord.substring(1);
		splitedSentenceList.set(0, firstWord);

		String lastWord = splitedSentenceList.get(splitedSentenceList.size() - 1);
		lastWord = lastWord + ".";
		splitedSentenceList.set(splitedSentenceList.size() - 1, lastWord);

		if (splitedSentenceList.size() == 1)
			return splitedSentenceList.get(0);

		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < splitedSentenceList.size(); i++) {

			if (i == splitedSentenceList.size() - 1)
				sb.append(splitedSentenceList.get(i));
			else
				sb.append(splitedSentenceList.get(i)).append(" ");

		}

		return sb.toString();
		
	}
}