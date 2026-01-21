import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int s;
    static ArrayDeque<int[]> dq;
    static int[][] visit;
    static int[][] map;
    static boolean[] infected;   // 컴퓨터 감염 여부

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int s = Integer.parseInt(br.readLine());
        dq = new ArrayDeque<>();
        map = new int[n+1][n+1];
        visit = new int[n+1][n+1];
        infected = new boolean[n + 1];

        int sum = 0;
        // 그래프 연관성을 map에 표시
        for (int i = 0; i < s; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 1) { // 시작점들을 스택에 저장 
            	dq.push(new int[] {a, b});
            	visit[a][b] = 1;
            	visit[b][a] = 1;
            }
            map[a][b] = 1; // 저장된 연관성을 표시 
            map[b][a] = 1;
        }

        // 시작점: 1번 컴퓨터
        infected[1] = true;        
        
        while(!dq.isEmpty()) {
            int[] cur = dq.pop();
            int x = cur[0];
            int y = cur[1];

            // 새 컴퓨터 감염 시점
            if (!infected[y]) {
                infected[y] = true;
                sum++;
            }

            for (int i = 0; i <= n; i++) {
            	if (visit[y][i] == 0 && map[y][i] == 1) { // y값에 연결 값들 중,또 퍼져나가는 컴퓨터가 있으면 Push
            		dq.push(new int[] {y, i});
            		visit[y][i] = 1;
            		visit[i][y] = 1;
            	}
            }
            
        }
        System.out.println(sum);
    }
}