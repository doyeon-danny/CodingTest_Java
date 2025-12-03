import java.util.*;
class Solution {
    public int[] solution(String myString) {
        String[] str = myString.split("x");
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i=0; i<str.length; i++) {
            arr.add(str[i].length());
        }
        
        if (String.valueOf(myString.charAt(myString.length()-1)).equals("x")) {
            arr.add(0);
        }
        
        int[] answer = new int[arr.size()];
        for (int i=0; i<arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}