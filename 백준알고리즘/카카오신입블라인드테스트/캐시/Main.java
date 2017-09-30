package Ä³½Ã;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public int solution(int cacheSize, String[] cities) {

		int answer = 0;

		List<String> cache = new ArrayList<>();

		if (cacheSize == 0)
			return cities.length * 5;

		for (int i = 0; i < cities.length; i++) {
			String city = cities[i].toLowerCase();

			if (cache.contains(city)) {
				cache.remove(city);
				cache.add(city);
				answer += 1;
				continue;
			}

			if (cache.size() < cacheSize) {
				cache.add(city);
				answer += 5;
				continue;
			}

			cache.remove(0);
			cache.add(city);
			answer += 5;
		}

		return answer;
	}
}
