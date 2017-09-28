package boj1005_acmcraft;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] buildTime = new int[n + 1];
			boolean[][] adj = new boolean[n + 1][n + 1];
			int[] inDegree = new int[n + 1];

			for (int i = 1; i <= n; i++)
				buildTime[i] = sc.nextInt();

			for (int i = 0; i < k; i++) {

				int from = sc.nextInt();
				int to = sc.nextInt();

				adj[from][to] = true;
				inDegree[to]++; // 진입차수를 지정해줌 (1 -> 2 인 경우 2의 진입차수를 1 더해줌)

			}

			int w = sc.nextInt();

			int[] result = topologicalSort(adj, inDegree, buildTime);

			System.out.println(result[w]);

		}

		sc.close();

	}

	public static int[] topologicalSort(boolean[][] adj, int[] indegree, int[] time) {

		Queue<Integer> q = new LinkedList<>();
		int len = indegree.length;
		int[] result = new int[len];

		for (int i = 1; i < len; i++) {

			if (indegree[i] == 0) { // 진입차수가 0인 경우 큐에 넣어주고 i번째 건물에 해당하는 시간을 결과
									// 배열에 넣어줌

				result[i] = time[i];
				q.add(i);
				break;

			}

		}

		while (!q.isEmpty()) {

			int v = q.poll(); // 진입차수가 0인 건물을 꺼냄

			for (int i = 1; i < len; i++) {

				if (adj[v][i]) {

					result[i] = Math.max(result[i], result[v] + time[i]);

					if (--indegree[i] == 0) { // i번째 건물의 진입차수를 1 줄이고 그 값이 0이면 큐에
												// 넣음
						q.add(i);

					}
				}

			}

		}

		return result;
	}
}