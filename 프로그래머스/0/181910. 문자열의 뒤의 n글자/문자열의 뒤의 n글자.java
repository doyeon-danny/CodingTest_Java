class Solution {
    public String solution(String my_string, int n) {
        // String answer = "";
        // for (int i=my_string.length()-n; i<my_string.length(); i++){
        //     answer += my_string.charAt(i);
        // }
        // return answer;
        return my_string.substring(my_string.length()-n);
    }
}