import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int len = speeds.length;
        int[] rests = new int[len];
        for (int i = 0; i < len; i++) {
            rests[i] = (100 - progresses[i]) / speeds[i] + ((100 - progresses[i]) % speeds[i] > 0 ? 1 : 0);
        }
        int temp = 1;
        int max = rests[0];
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i < len; i++) {
            if (max >= rests[i]) {
                temp++;
                continue;
            }
            arr.add(temp);
            max = rests[i];
            temp = 1;
        }
        arr.add(temp);
        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}