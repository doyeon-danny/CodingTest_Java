import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int sum = 0;
        for (int i = 0; i < line.length(); i++) {
            sum++;
            // =일 때
            if (line.charAt(i) == '=') {
//                sum--;
                // c, s, z
                if (i - 1 >= 0) {
                    if (line.charAt(i - 1) == 'c' || line.charAt(i - 1) == 's' || line.charAt(i - 1) == 'z') {
                        sum--;
                        // dz
                        if (i - 2 >= 0 && line.charAt(i-1) == 'z' && line.charAt(i-2) == 'd') {
                            sum--;
                        }
                    }
                }
            } else if (line.charAt(i) == '-') {
//                sum--;
                // c, d
                if (i - 1 >= 0) {
                    if (line.charAt(i - 1) == 'c' || line.charAt(i - 1) == 'd') {
                        sum--;
                    }
                }
            } else if (line.charAt(i) == 'j') {
                // l, n
                if (i - 1 >= 0) {
                    if (line.charAt(i - 1) == 'l' || line.charAt(i - 1) == 'n') {
                        sum--;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}