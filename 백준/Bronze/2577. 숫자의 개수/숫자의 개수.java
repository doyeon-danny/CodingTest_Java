import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int res = a * b * c;
        int[] arr = new int[10];
        
        while(true) {
        	if (res < 10) {
        		arr[res]++;
        		break;
        	}
        	int x = res % 10;
    		arr[x] += 1;
        	
        	res = res / 10;
        }
        
        for (int i = 0; i < 10; i++) {
        	System.out.println(arr[i]);
        }
    }
}