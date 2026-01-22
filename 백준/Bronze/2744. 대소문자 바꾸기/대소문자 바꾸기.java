import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		for (int i = 0; i < sb.length(); i++) {
			char x = sb.charAt(i);
			System.out.print(x == Character.toUpperCase(x) ? Character.toLowerCase(x) : Character.toUpperCase(x));
		}
	}

}
