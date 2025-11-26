class Solution {
    public String solution(String myString) {
        String answer = "";
        int l = (int)'l';       
        for (int i=0; i<myString.length(); i++) {
            Character chr = myString.charAt(i);
            if ((int)chr < l) {
                answer += 'l';
            } else {
                answer += chr;
            }
        }
        return answer;
    }
}