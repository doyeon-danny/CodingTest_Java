import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(st.hasMoreTokens()) {
            int a = Integer.parseInt(st.nextToken());
            if (a < x) {
                sb.append(a + " ");
            }
        }
        System.out.println(sb);
    }
}