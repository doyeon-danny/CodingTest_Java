class Solution {
    public int solution(int[][] arr) {
        int answer = 0;
        boolean wrong = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    wrong = true;
                    break;
                }
            }
        }
        return wrong == true ? 0 : 1;
    }
}