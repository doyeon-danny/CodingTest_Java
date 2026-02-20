import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            res.add(arr[i]);
        }
        for (int i = intervals[1][0]; i <= intervals[1][1]; i++) {
            res.add(arr[i]);
        }
        int[] answer = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            answer[i] = res.get(i);
        }
        return answer;
    }
}