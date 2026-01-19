import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String line = br.readLine();
            System.out.print(line.charAt(0));
            System.out.print(line.charAt(line.length() - 1));
            System.out.println();
        }
    }
}