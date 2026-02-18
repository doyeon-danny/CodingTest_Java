import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Long> arr = new ArrayList<>();
        while(n != 0) {
            arr.add(n % 10);
            n = n / 10;
        }
        Collections.sort(arr, Collections.reverseOrder());
        String x = "";
        for (int i = 0; i < arr.size(); i++) {
            x += String.valueOf(arr.get(i));
        }
        long y = Long.parseLong(x);
        return y;
    }
}