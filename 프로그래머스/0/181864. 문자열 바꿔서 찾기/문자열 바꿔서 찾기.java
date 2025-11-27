import java.util.*;
class Solution {
    public int solution(String myString, String pat) {
        if (myString.length() < pat.length()) {
            return 0;
        }
        
        String str = "";
        for (int i=0; i<myString.length(); i++) {
            if (myString.charAt(i) == 'A') {
                str += "B";
            } else {
                str += "A";
            }
        }
        int result = 0;

        for (int i=0; i < str.length()-pat.length()+1; i++) {
            if (str.substring(i, i+pat.length()).equals(pat)) {
                return 1;
                
            } 
        }
        
        return result;
    }
}