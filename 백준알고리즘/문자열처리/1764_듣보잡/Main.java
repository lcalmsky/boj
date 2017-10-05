
/*
 * https://www.acmicpc.net/problem/1764
 * 
 * [문제]
 * 김진영이 듣도 못한 사람의 명단과, 보도 못한 사람의 명단이 주어질 때, 듣도 보도 못한 사람의 명단을 구하는 프로그램을 작성하시오.
 * 
 * [입력]
 * 첫째 줄에 듣도 못한 사람의 수 N, 보도 못한 사람의 수 M이 주어진다. 이어서 둘째 줄부터 N개의 줄에 걸쳐 듣도 못한 사람의 이름과, N+2째 줄부터 보도 못한 사람의 이름이 순서대로 주어진다. 이름은
 * 띄어쓰기 없이 영어 소문자로만 이루어지며, 그 길이는 20 이하이다. N, M은 500,000 이하의 자연수이다.
 * 
 * [출력]
 * 듣보잡의 수와 그 명단을 사전순으로 출력한다.
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