import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        // ArrayList<Integer> arr = new ArrayList<>();
        // for (int i=0; i<num_list.length; i+=n) {
        //     arr.add(num_list[i]);
        // }
        // int[] answer = new int[arr.size()];
        // for (int i=0; i<arr.size(); i++) {
        //     answer[i] = arr.get(i);
        // }
        // return answer;
        
        int N = num_list.length % n == 0? num_list.length / n : num_list.length / n + 1;
        int[] answer = new int[N];
        int cnt = 0;
        for (int i=0; i<num_list.length; i+=n) {
            answer[cnt++] = num_list[i];  
        }
        return answer;
    }
}