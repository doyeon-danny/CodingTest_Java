import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i]; j++) {
                result.add(arr[i]);
            }
        }
        int[] answer = new int[result.size()];
        for (int i=0; i<result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}