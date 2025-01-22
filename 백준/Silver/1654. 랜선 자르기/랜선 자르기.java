import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        long[] arr = new long[k];
        long max = 0;

        for(int i = 0; i < k; i++) {
            arr[i] = Long.parseLong(br.readLine());
            max = Math.max(max, arr[i]);
        }

        long left = 1;
        long right = max;

        while(left <= right) {
            long mid = (left + right) / 2;
            long count = 0;

            for(int i = 0; i < k; i++) {
                count += arr[i] / mid;
            }

            if(count >= n) left = mid + 1;
            else right = mid - 1;
        }

        System.out.println(right);
    }
}