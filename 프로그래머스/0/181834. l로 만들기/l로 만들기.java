import java.util.stream.Collectors;

class Solution {
    public String solution(String myString) {
        // return myString.replaceAll("[^l-z]", "l");
        
        // return myString.chars()
        //     .mapToObj(i->Character.toString(Integer.max(i, 'l')))
        //     .collect(Collectors.joining());
        
        String answer = "";
        int l = (int)'l';       
        for (int i=0; i<myString.length(); i++) {
            Character chr = myString.charAt(i);
            if ((int)chr < l) {
                answer += 'l';
            } else {
                answer += chr;
            }
        }
        return answer;
    }
}