import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	static int r;
	static int c;
	static String[][] map;
	static int[][] visited;
	static ArrayDeque<int[]> dq = new ArrayDeque<>();
	static ArrayDeque<int[]> fireDq = new ArrayDeque<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		map = new String[r][c];
		visited = new int[r][c];
		
		for (int i = 0; i < r; i++) {
			String line = br.readLine();
			for (int j = 0; j < c; j++) {
				map[i][j] = String.valueOf(line.charAt(j));
				// 시작 인덱스 dq에 넣기 
				if (map[i][j].equals("J")) {
					dq.offer(new int[] {i, j});
					visited[i][j] = 1;
					
				}
				//불의 시작 인덱스 fireDq에 넣기 
				if (map[i][j].equals("F")) {
					fireDq.offer(new int[] {i, j});
//					visited[i][j]++;
				}
			}
		}
		bfs();
	}

	static void bfs() {
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		
		boolean flag = false;
		
		while(!dq.isEmpty()) {
			int fireSize = fireDq.size();
			for (int f = 0; f < fireSize; f++) {
			    int[] curFire = fireDq.poll();
			    int fx = curFire[0];
			    int fy = curFire[1];

			    for (int i = 0; i < 4; i++) {
			        int nfx = fx + dx[i];
			        int nfy = fy + dy[i];

			        if (nfx < 0 || nfx >= r || nfy < 0 || nfy >= c) continue;
			        if (map[nfx][nfy].equals("#") || map[nfx][nfy].equals("F")) continue;

			        map[nfx][nfy] = "F";
			        fireDq.offer(new int[] { nfx, nfy });
			    }
			}
			
			int size = dq.size();
			for (int k = 0; k < size; k++) {
				int[] cur = dq.poll();
				int x = cur[0];
				int y = cur[1];
				
				// 탈출 영역 도착하면 끝 
				if (x == 0 || x == r - 1 || y == 0 || y == c - 1) {
					System.out.println(visited[x][y]);
					return;
				}
				
				for (int i = 0; i < 4; i++) {
					int nx = x + dx[i];
					int ny = y + dy[i];
					
					// 범위 초과 
					if (nx < 0 || nx >= r || ny < 0 || ny >= c) {
						continue;
					}
					
					// 벽이거나 불이면 못감 
					if (map[nx][ny].equals("#") || map[nx][ny].equals("F") || visited[nx][ny] > 0) {
						continue;
					}
					
					dq.offer(new int[] {nx, ny});
					visited[nx][ny] = visited[x][y] + 1;
				}
			}
		}
		if (!flag) {
			System.out.println("IMPOSSIBLE");			
		}
	}
	
}
