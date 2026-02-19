class Solution {
    public String solution(String myString) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            char x = myString.charAt(i);
            if (x >= 'A' && x <= 'Z') {
                answer += (char)(x + 32);
            } else {
                answer += x;
            }
        }
        return answer;
    }
}