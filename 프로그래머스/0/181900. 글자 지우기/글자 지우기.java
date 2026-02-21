class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            boolean same = false;
            for (int j = 0; j < indices.length; j++) {
                if (i == indices[j]) {
                    same = true;
                    break;
                }    
            }
            if (same == true) {
                continue;
            } else {            
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}