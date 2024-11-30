import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			sum = sum - n + m;
			if (max < sum) max = sum;
		}
		System.out.println(max);
	}

}