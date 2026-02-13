import java.util.*;
import java.io.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        ArrayDeque<String> dq = new ArrayDeque<>();
        dq.push(String.valueOf(s.charAt(0)));
        for (int i = 1; i < s.length(); i++) {
            String curr = String.valueOf(s.charAt(i));
            if (!dq.isEmpty() && dq.peek().equals("(") && curr.equals(")")) {
                dq.pop();
            } else {
                dq.push(curr);
            }
        }
        if (!dq.isEmpty()) {
            answer = false;
        }
        return answer;
    }
}