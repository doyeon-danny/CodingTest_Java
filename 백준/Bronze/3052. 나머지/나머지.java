import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int x = Integer.parseInt(br.readLine()) % 42;
            boolean onlyOne = true;
            for (int k = 0; k < arr.size(); k++) {
                if (arr.get(k) == x) {
                    onlyOne = false;
                    continue;
                }
            }
            if (onlyOne == true) {
                arr.add(x);
            }
        }
        System.out.println(arr.size());
    }
}