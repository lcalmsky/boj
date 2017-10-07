
/*
 * [��ó]
 * https://www.acmicpc.net/problem/1931
 * 
 * [����]
 * �� ���� ȸ�ǽ��� �ִµ� �̸� ����ϰ��� �ϴ� n���� ȸ�ǵ鿡 ���Ͽ� ȸ�ǽ� ���ǥ�� ������� �Ѵ�. �� ȸ�� I�� ���� ���۽ð��� ������ �ð��� �־��� �ְ�, �� ȸ�ǰ� ��ġ�� �ʰ� �ϸ鼭 ȸ�ǽ��� ����� ��
 * �ִ� �ִ���� ȸ�Ǹ� ã�ƶ�. ��, ȸ�Ǵ� �ѹ� �����ϸ� �߰��� �ߴܵ� �� ������ �� ȸ�ǰ� ������ �Ͱ� ���ÿ� ���� ȸ�ǰ� ���۵� �� �ִ�. ȸ���� ���۽ð��� ������ �ð��� ���� ���� �ִ�. �� ��쿡��
 * �������ڸ��� ������ ������ �����ϸ� �ȴ�.
 * 
 * [�Է�]
 * ù° �ٿ� ȸ���� �� n(1<=n<=100,000)�� �־�����. ��° �ٺ��� n+1 �ٱ��� �� ȸ���� ������ �־����µ� �̰��� ������ ���̿� �ΰ� ȸ���� ���۽ð��� ������ �ð��� �־�����. ���� �ð��� ������
 * �ð��� 231-1���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.
 * 
 * [���]
 * ù° �ٿ� �ִ� ����� �� �ִ� ȸ�� ���� ����Ͽ���.
 * 
 * [���� �Է�]
 * 11
 * 1 4
 * 3 5
 * 0 6
 * 5 7
 * 3 8
 * 5 9
 * 6 10
 * 8 11
 * 8 12
 * 2 13
 * 12 14
 * 
 * [���� ���]
 * 4
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.valueOf(in.readLine());

		List<Meeting> meetingList = new ArrayList<>();

		while (n-- > 0) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			Meeting m = new Meeting();
			m.start = Integer.valueOf(st.nextToken());
			m.end = Integer.valueOf(st.nextToken());
			meetingList.add(m);
		}

		Collections.sort(meetingList, new Comparator<Meeting>() {
			@Override
			public int compare(Meeting o1, Meeting o2) {
				return o1.end > o2.end ? 1 : o1.end < o2.end ? -1 : o1.start < o2.start ? -1 : 0;
			}
		});

		int end = 0, cnt = 0;
		for (Meeting meeting : meetingList) {
			if (end <= meeting.start) {
				cnt++;
				end = meeting.end;
			}
		}

		System.out.println(cnt);

		in.close();

	}

}

class Meeting {
	int start, end;
}