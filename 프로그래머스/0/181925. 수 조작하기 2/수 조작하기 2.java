class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for (int i = 1; i < numLog.length; i++) {
            int x = numLog[i] - numLog[i - 1];
            answer += x == 1 ? 'w' : x == -1 ? 's' : x == 10 ? 'd' : 'a';
        }
        return answer;
    }
}