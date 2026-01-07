import java.util.*;
import java.io.*;

public class Main {
	static int n = 0;
	static int m = 0;
	static int[][] map;
	static int[][] dist;
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        dist = new int[n][m];
        for (int i = 0; i < n; i++) {
        	String line = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = Character.getNumericValue(line.charAt(j));
            }
        }
        bfs();
    }
    
    static void bfs() {
        ArrayDeque<int[]> dq = new ArrayDeque<>();
        
        // 시작점 
        dq.offer(new int[]{0, 0});
        dist[0][0] = 0;
        
        // 상, 하, 좌, 우
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
//        int cnt = 0;
        
        // 빌 때까지
        while (!dq.isEmpty()) {
            // Q에서 이동할 정점을 빼내고 방문표시
            int[] cur = dq.poll();
            int x = cur[0];
            int y = cur[1];
//            dist[x][y] = cnt++;
            dist[x][y]++;
            
            if (x == n-1 && y == m-1) {
            	System.out.println(dist[x][y]);
            	break;
            }

            // 4방향 탐색
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                // 4방향 정점이 인덱스 범위 내부가 아니면 스킵
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }
                
                // 정점이 장애물이면 스킵
                if (map[nx][ny] == 0 || dist[nx][ny] > 0) {
                    continue;
                }
                
                // 문제가 없으면 탐색할 정점으로 Q에 저장
                dq.offer(new int[]{nx, ny});
                dist[nx][ny] = dist[x][y];
            }
        }
    }
    
}