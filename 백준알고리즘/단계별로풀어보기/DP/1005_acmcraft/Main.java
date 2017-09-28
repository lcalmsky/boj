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
				inDegree[to]++; // ���������� �������� (1 -> 2 �� ��� 2�� ���������� 1 ������)

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

			if (indegree[i] == 0) { // ���������� 0�� ��� ť�� �־��ְ� i��° �ǹ��� �ش��ϴ� �ð��� ���
									// �迭�� �־���

				result[i] = time[i];
				q.add(i);
				break;

			}

		}

		while (!q.isEmpty()) {

			int v = q.poll(); // ���������� 0�� �ǹ��� ����

			for (int i = 1; i < len; i++) {

				if (adj[v][i]) {

					result[i] = Math.max(result[i], result[v] + time[i]);

					if (--indegree[i] == 0) { // i��° �ǹ��� ���������� 1 ���̰� �� ���� 0�̸� ť��
												// ����
						q.add(i);

					}
				}

			}

		}

		return result;
	}
}