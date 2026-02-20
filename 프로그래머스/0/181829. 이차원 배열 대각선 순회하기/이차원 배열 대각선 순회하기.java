class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        int row = board.length;
        int column = board[0].length;
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                if (r + c <= k) {
                    answer += board[r][c];
                }
            }
        }
        return answer;
    }
}