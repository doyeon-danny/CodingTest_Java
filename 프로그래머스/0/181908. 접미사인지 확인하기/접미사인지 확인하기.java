class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int len1 = my_string.length();
        int len2 = is_suffix.length();
        
        if (len1 >= len2) {            
            return my_string.substring(len1-len2).equals(is_suffix)? 1 : 0;
        } else {
            return 0;
        }
    }
}