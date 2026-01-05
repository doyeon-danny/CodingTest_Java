import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		ArrayDeque<int[]> stack = new ArrayDeque<>();
//		stack.push({Integer.parseInt(st.nextToken(), 0)}); // 높이, 수신탑 인덱스
		for (int i = 1; i <= N; i++) {
			int curHeight = Integer.parseInt(st.nextToken());
			
			while (!stack.isEmpty() && stack.peek()[0] < curHeight) { // stack에서 빼버리려면, stack은 비어있지 않으면서도, 현재의 탑이 stack의 탑보다 커야한다
				stack.pop();
			}
			if (stack.isEmpty()) { // 왼쪽에 수신할 탑이 없으므로 0
				sb.append(0 + " ");
			} else { // 왼쪽에 수신할 탑이 있으므로 비교해봐야 함
				sb.append(stack.peek()[1] + " ");
			}
			stack.push(new int[] {curHeight, i});
		}
		System.out.println(sb);
	}

}
