import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		String flow = a - b > 0 ? "descending" : "ascending";
		
		while (st.hasMoreTokens()) {
			a = b;
			b = Integer.parseInt(st.nextToken());
			if (flow.equals("ascending") && a - b < 0) {
				continue;
			} else if (flow.equals("descending") && a - b > 0) {
				continue;
			} else {
				flow = "mixed";
				break;
			}
		}
		System.out.println(flow);
	}

}
