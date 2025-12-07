import java.io.*;
import java.util.*;
class Solution {
    public String[] solution(String my_string) {        
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arr = new ArrayList<>();
        // ArrayList<String> temp = new ArrayList<>();

        // 한글자씩 더하다가 공백 만나면 초기화
        for (int i = 0; i < my_string.length(); i++) {
            // 공백 만나면 arr에 저장 및 초기화
            if (String.valueOf(my_string.charAt(i)).equals(" ")) {
                if (sb.length() != 0) {
                    arr.add(sb.toString());
                    sb.delete(0, sb.length());
                }
            } else {
                sb.append(String.valueOf(my_string.charAt(i)));
            }
        }
        if (sb.length() != 0) {
            arr.add(sb.toString());
        }
        String[] answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}