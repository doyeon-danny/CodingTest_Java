import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            
            int a;
            int r;
            if (n % h == 0) {
            	r = h;
            	a = n / h;
            } else {
            	r = n % h;            	
            	a = n / h + 1;
            }
            
            System.out.println(r + String.format("%02d", a));
        }
    }
}