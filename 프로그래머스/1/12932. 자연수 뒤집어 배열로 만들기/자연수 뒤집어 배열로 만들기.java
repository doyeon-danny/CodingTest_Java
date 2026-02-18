import java.util.*;
class Solution {
    public int[] solution(long n) {
        // int[] answer = {};
        String x = String.valueOf(n);
        int[] answer = new int[x.length()];
        for (int i = 0; i < x.length(); i++) {
            answer[i] = (int)(n % 10);
            n = n / 10;
        }
        return answer;
    }
}