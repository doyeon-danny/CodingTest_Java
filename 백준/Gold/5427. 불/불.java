import java.util.*;
import java.io.*;

public class Main {
	static int w;
	static int h;
	static char[][] map;
	static int[][] s_visit;
	static int[][] f_visit;
	static ArrayDeque<int[]> s;
	static ArrayDeque<int[]> f;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			h = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());
			map = new char[w][h];
			s_visit = new int[w][h];
			f_visit = new int[w][h];
			
			s = new ArrayDeque<>();
			f = new ArrayDeque<>();
			
			for (int i = 0; i < w; i++) {
				String line = br.readLine();
				for (int j = 0; j < h; j++) {
					map[i][j] = line.charAt(j);
					if (map[i][j] == '*') {
						f.offer(new int[]{i, j});
						f_visit[i][j] = 1;
					}
					if (map[i][j] == '@') {
						s.offer(new int[]{i, j});
						s_visit[i][j] = 1;
					}
				}
			}
		
		bfs();
		}
	}
	static void bfs() {
		// 불의 방문시간부터 표시
		while(!f.isEmpty()) {
			int[] fcur = f.poll();
			int fx = fcur[0];
			int fy = fcur[1];
			
			int[] fdx = {-1, 1, 0, 0};
			int[] fdy = {0, 0, -1, 1};
			
			for (int i = 0; i < 4; i++) {
				int fnx = fx + fdx[i];
				int fny = fy + fdy[i];
				
				// 배열 범위 초과 체크 
				if (fnx < 0 || fnx >= w || fny < 0 || fny >= h) {
					continue;
				}
				
				// .이 아니면 다 패스
				if (map[fnx][fny] != '.' || f_visit[fnx][fny] != 0) {
					continue;
				}
				f.offer(new int[] {fnx, fny});
				f_visit[fnx][fny] = f_visit[fx][fy] + 1;
			}
		}
		
		// 상근은 불의 방문 시간을 기준으로 비교하며 움직임
		while(!s.isEmpty()) {
			int [] cur = s.poll();
			int x = cur[0];
			int y = cur[1];
			
			if (x == 0 || x == w - 1 || y == 0 || y == h - 1) {
				System.out.println(s_visit[x][y]);
				return;
			}
			
			int[] dx = {-1, 1, 0, 0};
			int[] dy = {0, 0, -1, 1};
			
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				// 배열 범위 초과 체크 
				if (nx < 0 || nx >= w || ny < 0 || ny >= h) {
					continue;
				}
				
				// .이 아니면 다 패스 / 방문했으면 패 / 불의 움직임이 같거나 빠를 때  
				if (map[nx][ny] != '.' || s_visit[nx][ny] != 0 || (f_visit[nx][ny] != 0 && f_visit[nx][ny] <= s_visit[x][y] + 1)) {
					continue;
				}
				s.offer(new int[] {nx, ny});
				s_visit[nx][ny] = s_visit[x][y] + 1;
			}
		}
		System.out.println("IMPOSSIBLE");

	}

}
