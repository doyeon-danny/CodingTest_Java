import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int multi = 1;
		
		while(st.hasMoreTokens()) {
			multi *= Integer.parseInt(st.nextToken());
		}
		System.out.println(multi);
	}

}
