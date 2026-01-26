import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        int aa = Integer.parseInt(a);
        int bb = Integer.parseInt(b);
        int cc = Integer.parseInt(c);
        System.out.println(aa + bb - cc);
        System.out.println(Integer.parseInt(a + b) - Integer.parseInt(c));
    }
}