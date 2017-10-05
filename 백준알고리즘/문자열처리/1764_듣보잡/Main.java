
/*
 * https://www.acmicpc.net/problem/1764
 * 
 * [����]
 * �������� �赵 ���� ����� ��ܰ�, ���� ���� ����� ����� �־��� ��, �赵 ���� ���� ����� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * [�Է�]
 * ù° �ٿ� �赵 ���� ����� �� N, ���� ���� ����� �� M�� �־�����. �̾ ��° �ٺ��� N���� �ٿ� ���� �赵 ���� ����� �̸���, N+2° �ٺ��� ���� ���� ����� �̸��� ������� �־�����. �̸���
 * ���� ���� ���� �ҹ��ڷθ� �̷������, �� ���̴� 20 �����̴�. N, M�� 500,000 ������ �ڿ����̴�.
 * 
 * [���]
 * �躸���� ���� �� ����� ���������� ����Ѵ�.
 * 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String line = in.readLine();
		StringTokenizer st = new StringTokenizer(line);

		int n = Integer.valueOf(st.nextToken()), m = Integer.valueOf(st.nextToken());
		Set<String> neverHeard = new HashSet<>(), result = new HashSet<>();
		String[] neverSeen = new String[m];

		for (int i = 0; i < n; i++)
			neverHeard.add(in.readLine());

		for (int i = 0; i < neverSeen.length; i++)
			neverSeen[i] = in.readLine();

		in.close();

		for (String ns : neverSeen)
			if (neverHeard.contains(ns)) result.add(ns);

		String[] tmp = result.toArray(new String[result.size()]);
		Arrays.sort(tmp);

		StringBuilder sb = new StringBuilder();
		sb.append(tmp.length).append("\n");

		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		for (String s : tmp)
			sb.append(s).append("\n");

		out.write(sb.toString());
		out.flush();
		out.close();

	}
}