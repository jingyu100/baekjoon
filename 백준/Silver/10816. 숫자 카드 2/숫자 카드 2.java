import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] cnt = new int[20000001];
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            cnt[num + 10000000]++;  
        }
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(cnt[num + 10000000]).append(" ");
        }
        
        System.out.println(sb);
    }
}