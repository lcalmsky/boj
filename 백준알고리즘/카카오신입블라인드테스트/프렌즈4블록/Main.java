package «¡∑ª¡Ó4∫Ì∑œ;

public class Main {

	public static void main(String[] args) {
		System.out.println(new Main().solution(5, 2, new String[] { "BB", "BB", "BB", "AA", "AA" }));
	}

	private char[][] gameBoard;
	private boolean[][] trueBoard;
	private boolean isRemain;
	private char STANDARD = (char) ('Z' + 1);

	public int solution(int m, int n, String[] board) {
		int answer = 0;

		gameBoard = new char[m][n];
		trueBoard = new boolean[m][n];

		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard[i].length; j++) {
				gameBoard[i][j] = board[i].charAt(j);
			}
		}

		while (true) {

			find();

			if (!isRemain) {
				break;
			}

			answer += change();

			isRemain = false;

		}

		return answer;
	}

	private int change() {
		int cnt = 0;

		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard[i].length; j++) {

				if (trueBoard[i][j]) {
					cnt++;

					for (int k = i; k != 0; k--) {
						gameBoard[k][j] = gameBoard[k - 1][j];

						if (k == 1) {
							gameBoard[0][j] = STANDARD;
						}
					}

					trueBoard[i][j] = false;
				}
			}
		}
		return cnt;
	}

	private void find() {

		for (int i = 0; i < gameBoard.length - 1; i++) {
			for (int j = 0; j < gameBoard[i].length - 1; j++) {

				char nw = gameBoard[i][j];
				char ne = gameBoard[i][j + 1];
				char sw = gameBoard[i + 1][j];
				char se = gameBoard[i + 1][j + 1];

				if (nw > 'Z')
					continue;

				if (nw == ne && ne == sw && sw == se) {
					trueBoard[i][j] = true;
					trueBoard[i][j + 1] = true;
					trueBoard[i + 1][j] = true;
					trueBoard[i + 1][j + 1] = true;

					isRemain = true;
				}

			}
		}

	}

}
