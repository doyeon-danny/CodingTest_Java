class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[] answer = new int[len];
        // num_list : n ~ num_list.length(x)
        // answer : 0 ~ x - n - 1
        for (int i = n; i < len; i++) {
            answer[i - n] = num_list[i];
        }
        // num_list : 0 ~ n - 1
        // answer : x - n ~ x
        for (int i = 0; i < n; i++) {
            answer[i + len - n] = num_list[i];
        }
        
        return answer;
    }
}