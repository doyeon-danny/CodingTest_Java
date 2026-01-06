import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][m];
		int[][] visited = new int[n][m];
		
		for (int i = 0; i < n; i++) { 
			StringBuilder sb = new StringBuilder(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Character.getNumericValue(sb.charAt(j));
			}
		}
		ArrayDeque<int[]> dq = new ArrayDeque<>();
		int[] dx = {1, -1, 0, 0};
		int[] dy = {0, 0, 1, -1};
			
		// 현재 위치 방문 표시 
		visited[0][0] = 1;
		dq.offer(new int[] {0, 0});
		// dq가 빌 때까지 => 탐색할 곳이 없을때 까지 
		while(!dq.isEmpty()) {
			int[] cur = dq.poll();
			
			// 주변 탐색 후 dq에 탐색할 정점 넣기
			for (int i = 0; i < 4; i++) {
				int nx = cur[0] + dx[i];
				int ny = cur[1] + dy[i];
				// 범위 내에 있고, visited가 0이면 넣자.
				if ((0 <= nx && nx < n) && (0 <= ny && ny < m) && arr[nx][ny] == 1 && visited[nx][ny] == 0) {
//					dq.offer(new int[] {nx, ny, ++now[2]});
					visited[nx][ny] = visited[cur[0]][cur[1]] + 1;
					dq.offer(new int[] {nx, ny});
				}				
			}
		}
		System.out.println(visited[n-1][m-1]);

	} 

}
