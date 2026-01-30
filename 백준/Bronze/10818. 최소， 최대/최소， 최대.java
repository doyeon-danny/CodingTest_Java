import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.MIN_VALUE;
        int m = Integer.MAX_VALUE;
        
        while(st.hasMoreTokens()) {
            int a = Integer.parseInt(st.nextToken());
            if (a > x) {
                x = a;
            }
            if (a < m) {
                m = a;
            }
        }
        System.out.println(m + " " + x);
    } 
}