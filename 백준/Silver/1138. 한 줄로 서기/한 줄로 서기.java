import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());  
        
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            int cnt = Integer.parseInt(st.nextToken());
            for (int j = 0; j < n; j++) {
                if (cnt == 0 && result[j] == 0) {
                    result[j] = i + 1;
                    break;
                } else if (result[j] == 0) cnt--;
            }
        }
        
        for (int i = 0; i < n; i++) {
            sb.append(result[i]).append(" ");
        }
        
        System.out.println(sb);
    }
}