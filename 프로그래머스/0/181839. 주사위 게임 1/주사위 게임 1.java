class Solution {
    public int solution(int a, int b) {
        // int answer = 0;
        // return answer;
        
        return a % 2 == 1 && b % 2 == 1 ? a*a + b*b : a % 2 == 0 && b % 2 == 0 ? Math.abs(a-b) : 2*(a+b);
    }
}