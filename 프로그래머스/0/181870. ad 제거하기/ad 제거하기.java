class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        
        int cnt = 0;
        for (int i=0; i<strArr.length; i++) {
            // System.out.println(i);
            if (!strArr[i].contains("ad")) {
                answer[cnt++] = strArr[i];
            }
            
        }
        String[] result = new String[cnt];
        for (int i=0; i<cnt; i++) {
            result[i] = answer[i];
        }
        return result;
    }
}