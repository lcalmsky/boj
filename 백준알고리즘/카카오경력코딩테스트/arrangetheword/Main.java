
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

		String result = null;

		sentence = sentence.toLowerCase().replace(".", "");

		String[] splitedSentence = sentence.split(" ");
		List<String> splitedSentenceList = Arrays.asList(splitedSentence);
		splitedSentenceList.sort((s1, s2) -> s1.length() - s2.length());

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < splitedSentenceList.size(); i++) {

			sb.append(splitedSentenceList.get(i));
			if (i != splitedSentenceList.size() - 1) sb.append(" ");

		}

		result = sb.append(".").toString();
		result = result.substring(0, 1).toUpperCase() + result.substring(1);

		return result;

	}
}