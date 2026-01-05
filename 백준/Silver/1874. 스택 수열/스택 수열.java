import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] input = new int[N];
		for (int i = 0; i < N; i++) {
			input[i] = Integer.parseInt(br.readLine());
		}
		StringBuilder sb = new StringBuilder();
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		int current = 1;
		boolean flag = true;
		for (int target : input) {
			// 자연수는 오름차순이므로, target값보다 작을때만 push
			while (current <= target) {
				stack.push(current);
				current++;
				sb.append("+\n");
			}
			if (stack.peek() == target) {
				stack.pop();
				sb.append("-\n");
			} else {
				flag = false;
			}
		}
		System.out.println(flag == true? sb : "NO");
	}

}
