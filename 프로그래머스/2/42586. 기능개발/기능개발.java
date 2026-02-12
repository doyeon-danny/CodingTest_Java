import java.util.*;
import java.io.*;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // int[] answer = {};
        int len = speeds.length;
        int[] days = new int[len];
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            days[i] = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] > 0) {
                days[i]++;
            }
            System.out.println("days[i]: " + days[i]);
        }
        dq.addLast(days[0]);
        
        int temp = 1;
        for (int i = 1; i < len; i++) {
        	int curr = dq.peekLast();
        	if (days[i] <= curr) {
        		temp++;
        	} else {
	        	dq.addLast(days[i]);
	        	arr.add(temp);
	        	temp = 1;
        	}
        }
        arr.add(temp);
        
        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
        	answer[i] = arr.get(i);
        }
        return answer;
    }
}