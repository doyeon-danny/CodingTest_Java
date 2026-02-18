class Solution {
    public boolean solution(int x) {        
        int k = x;
        int sum = 0;
        while (k / 10 != 0) {
            sum += k % 10;
            k = k / 10;
        }
        sum += k;
        
        return x % sum == 0 ? true : false;
    }
}