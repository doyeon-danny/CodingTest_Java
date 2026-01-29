import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = 0;
        int n = 0;
        for (int i = 1; i <= 9; i++) {
        	int x = Integer.parseInt(br.readLine());
        	if (x > m) {
        		m = x;
        		n = i;
        	}
        }
        System.out.println(m);
        System.out.println(n);
    }
}