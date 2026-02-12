import java.util.*;
import java.io.*;

public class Solution {
    public int[] solution(int []arr) {        
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (dq.isEmpty()) {
                dq.addLast(arr[i]);
            } else {
                int prev = dq.peekLast();
                if (prev != arr[i]) {
                    dq.addLast(arr[i]);
                }
            }
            
        }
        
        int[] answer = new int[dq.size()];
        int idx = 0;
        for (int num : dq) {
            answer[idx++] = num;
        }

        return answer;
    }
}