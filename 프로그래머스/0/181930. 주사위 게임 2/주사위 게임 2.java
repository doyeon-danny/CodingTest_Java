import java.util.*;
class Solution {
    public int solution(int a, int b, int c) {
        Set<String> set = new HashSet<>();
        set.add(String.valueOf(a));
        set.add(String.valueOf(b));
        set.add(String.valueOf(c));
        
        if (set.size() == 3) {
            return a+b+c;
        } else if (set.size() == 2) {
            return (a+b+c) * (a*a + b*b + c*c);    
        } else {
            return (a+b+c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        }
    }
}