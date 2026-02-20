class Solution {
    public String[] solution(String[] names) {
        int x = names.length % 5 > 0 ? names.length / 5 + 1 : names.length / 5;
        String[] answer = new String[x];
        for (int i = 0; i < x; i++) {
            answer[i] = names[i * 5];
        }
        return answer;
    }
}