import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        if (h == 0) {
            if (m >= 45) {
                System.out.println(0 + " " + (m - 45));
            } else {
                System.out.println(23 + " " + (m + 15));
            }
        } else {
            if (m >= 45) {
                System.out.println(h + " " + (m - 45));
            } else {
                System.out.println((h - 1) + " " + (m + 15));
            }
        }
    }
}