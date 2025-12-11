import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        int N = st.countTokens();
        
        String[] answer = new String[N];
        int i = 0;
        while(st.hasMoreTokens()) {
            answer[i] = st.nextToken();
            i++;
        }
        
        return answer;
    }
}