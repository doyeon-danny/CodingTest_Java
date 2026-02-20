import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        ArrayList<String> arr2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("")) {
                arr2.add(arr[i]);
            }
        }
        
        // Arrays.sort(arr2);
        String[] answer = new String[arr2.size()];
        for (int i = 0 ; i < arr2.size(); i++) {
            answer[i] = arr2.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}