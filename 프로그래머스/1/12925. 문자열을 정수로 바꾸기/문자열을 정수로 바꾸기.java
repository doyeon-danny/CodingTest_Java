class Solution {
    public int solution(String s) {
        int answer = 0;
        if (s.charAt(0) == '+') {
            return Integer.parseInt(s.substring(1));
        } else if (s.charAt(0) == '-') {
            return -Integer.parseInt(s.substring(1));
        } 
        return Integer.parseInt(s);
    }
}