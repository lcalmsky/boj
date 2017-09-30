package 비밀지도;

public class Main {

	public String[] solution(int n, int[] arr1, int[] arr2) {

		String[] answer = new String[n];

		int[][] map1 = new int[n][n];
		int[][] map2 = new int[n][n];

		for (int i = 0; i < map1.length; i++) {

			int x = arr1[i];

			for (int j = n - 1;; j--) {

				if (x == 0) {
					map1[i][j] = 0;
					break;
				}

				if (x == 1) {
					map1[i][j] = 1;
					break;
				}
				map1[i][j] = x % 2;
				x /= 2;
			}

			int y = arr2[i];

			for (int j = n - 1;; j--) {

				if (y == 0) {
					map2[i][j] = 0;
					break;
				}

				if (y == 1) {
					map2[i][j] = 1;
					break;
				}
				map2[i][j] = y % 2;
				y /= 2;
			}

		}

		for (int i = 0; i < answer.length; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < map1[i].length; j++) {
				sb.append(map1[i][j] + map2[i][j] != 0 ? "#" : " ");
			}
			answer[i] = sb.toString();
		}

		return answer;
	}
}
