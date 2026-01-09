
import java.util.*;
import java.io.*;

public class Main {
    static int m, n;
    static int[][] map;
    static int[][] visited;
    static ArrayDeque<int[]> dq = new ArrayDeque<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 열
        m = Integer.parseInt(st.nextToken()); // 행

        map = new int[m][n];
        visited = new int[m][n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                visited[i][j] = -1; // 방문 안 함 표시
            }
        }

        // 다중 시작점
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    dq.offer(new int[]{i, j});
                    visited[i][j] = 0; // 0일차
                }
            }
        }

        bfs();
    }

    static void bfs() {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while (!dq.isEmpty()) {
            int[] cur = dq.poll();
            int x = cur[0];
            int y = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
                if (map[nx][ny] != 0 || visited[nx][ny] != -1) continue;

                visited[nx][ny] = visited[x][y] + 1;
                dq.offer(new int[]{nx, ny});
            }
        }

        int result = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 0 && visited[i][j] == -1) {
                    System.out.println(-1);
                    return;
                }
                result = Math.max(result, visited[i][j]);
            }
        }

        System.out.println(result);
    }
}