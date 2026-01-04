import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        
        int result = 0;
        if (x > 0) {
            if (y > 0) {
                result = 1;
            } else {
                result = 4;
            }
        } else {
            if (y > 0) {
                result = 2;
            } else {
                result = 3;
            }
        }
        System.out.println(result);
    }
}