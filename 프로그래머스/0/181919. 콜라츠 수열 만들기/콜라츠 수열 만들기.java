import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] ans = {};
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(n);

        while(n != 1) {
            n = n%2==0? n/2 : 3*n + 1;
            answer.add(n);
            
        }
        int[] result = new int[answer.size()];
        for (int i=0; i<answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}