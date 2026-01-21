import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        while (st.hasMoreTokens()) {
            int x = Integer.parseInt(st.nextToken());
            sum += x * x;
        }
        System.out.println(sum % 10);
    }
}