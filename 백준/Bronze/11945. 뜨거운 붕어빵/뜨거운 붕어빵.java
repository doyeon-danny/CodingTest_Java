import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
        	String line = br.readLine();
        	StringBuilder sb = new StringBuilder();
            for (int j = m-1; j > -1; j--) {
            	sb.append(line.charAt(j));
            }
            System.out.println(sb);
        }
    }
}