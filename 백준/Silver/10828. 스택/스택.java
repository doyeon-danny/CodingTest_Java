import java.util.*;
import java.io.*;

class myStack {
	private int[] stack;
	private int top = -1;
	
	myStack(int size) {
		stack = new int[size];
	}
	
	void push(int value) {
		stack[++top] = value;
	}
	
	int pop() {
		// return stack[top--];
		if (top == -1) {
//			System.out.println("-1");
			return -1;
		} else {
//			System.out.println(stack[top]);
			return stack[top--];
		}
	}
	
	int peek() {
//		System.out.println(stack[top]);
		if (top == -1) {
//			System.out.println("-1");
			return -1;
		} else {
//			System.out.println(stack[top]);
			return stack[top];
		}
	}
	
	boolean isEmpty() {
		// return top == -1;
		return top == -1;
	}
	
	int size() {
//		System.out.println(top + 1);
		return top + 1;
	}
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
//        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(br.readLine());
        myStack stack = new myStack(N);
        
        for (int i = 0; i < N; i++){
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	String cmd = st.nextToken();
        	if (cmd.charAt(0) == 'p') {
        		if (cmd.charAt(1) == 'u') { // push
//        			ms.push(Character.getNumericValue(sb.charAt(5)));
        			stack.push(Integer.parseInt(st.nextToken()));
        		} else { // pop
//        			stack.pop();
        			sb.append(stack.pop()).append('\n');
        		}
        	} else if (cmd.charAt(0) == 't') { // top
//        		ms.peek();
        		sb.append(stack.peek()).append('\n');
        	} else if (cmd.charAt(0) == 's') { // size
//        		ms.size();
        		sb.append(stack.size()).append('\n');
        	} else { // empty
//        		ms.isEmpty();
        		sb.append(stack.isEmpty() ? 1 : 0).append('\n');
        	}
        }
       System.out.println(sb);
    }
}
