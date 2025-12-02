import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> arr = new ArrayList<>();
        int cnt = 0;
        for (int i=0; i<strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                arr.add(strArr[i]);
            }   
        }
        String[] answer = new String[arr.size()];
        
        for (int i=0; i<arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}