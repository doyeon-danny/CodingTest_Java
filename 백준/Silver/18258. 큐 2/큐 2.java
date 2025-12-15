import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			// 변수명은 명령어이므로 command가 직관적
			String command = br.readLine();
			// 명령 문자열은 push 빼고 단일 단어기 때문에 split이나 ST도 쓸 필요가 없다.
			// 첫글자로 분기
			if (command.charAt(0) == 'p') {
				
				// pop : dq.poll()
				if (command.charAt(1) == 'o') {
					if (dq.isEmpty() ) {
						sb.append(-1).append('\n');
					} else {
						sb.append(dq.poll()).append('\n');					
					}
				// push : dq.offer()
				} else {
//					dq.add(Integer.parseInt(command.substring(5)));
					dq.offerLast(Integer.parseInt(command.substring(5)));
				}
			} else if (command.charAt(0) == 's') {
				// size
				sb.append(dq.size()).append('\n');
			} else if (command.charAt(0) == 'e') {
				// empty
				if (dq.isEmpty()) {
					sb.append(1).append('\n');
				} else {
					sb.append(0).append('\n');
				}
			} else if (command.charAt(0) == 'f') {
				// front : dq.peek()
				if (dq.isEmpty() ) {
					sb.append(-1).append('\n');
				} else {
					sb.append(dq.peekFirst()).append('\n');
				}
			} else {
				// back
				if (dq.isEmpty() ) {
					sb.append(-1).append('\n');
				} else {
					sb.append(dq.peekLast()).append('\n');
				}
			}
		}
		System.out.println(sb.toString());
	}

}
