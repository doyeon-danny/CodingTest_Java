import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[31];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i < 29; i++) {
            int x = Integer.parseInt(br.readLine());
            if (arr[x] == 0) {
                arr[x]++;
            }
        }
        for (int i = 1; i < 31; i++) {
            if (arr[i] == 0) {
                System.out.println(i);
            }
        }
    }
}