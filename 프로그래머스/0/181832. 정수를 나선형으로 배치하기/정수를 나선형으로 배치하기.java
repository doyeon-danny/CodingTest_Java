import java.util.*;

class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int tot = n * n;
        int idx = 1;
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int k = 0;
        int[] x = {0, 0};
        
        while (tot > 0) {
            answer[x[0]][x[1]] = idx;
            if (x[0] + dx[k] < 0 || x[0] + dx[k] >= n || x[1] + dy[k] < 0 || x[1] + dy[k] >= n || answer[x[0]+dx[k]][x[1]+dy[k]] != 0) {
                k = ++k % 4;
            } 
            x[0] = x[0] + dx[k];
            x[1] = x[1] + dy[k];
            tot--;
            idx++;
        }
        return answer;
    }
}