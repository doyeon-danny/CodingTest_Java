import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
        	sb = new StringBuilder(br.readLine());
            for (int j = m-1; j > -1; j--) {
                int val = Character.getNumericValue(sb.charAt(j));
                System.out.print(val);
            }

            System.out.println();
        }
    }
}