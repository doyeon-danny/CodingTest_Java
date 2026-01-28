import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] coin = new int[n];
        int sum = 0;
        
        for (int i = n-1; i >= 0; i--) {
            coin[i] = Integer.parseInt(br.readLine());
        }
        while(k != 0) {
            for(int i = 0; i < n; i++) {
                if (coin[i] <= k) {
                    k = k - coin[i];
                    sum++;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}