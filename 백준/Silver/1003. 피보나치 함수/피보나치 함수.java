import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[][] dp = new int[41][2];
        
        int t = Integer.parseInt(br.readLine());
        
        dp[0][0] = 1; 
        dp[0][1] = 0; 
        dp[1][0] = 0; 
        dp[1][1] = 1; 
        
        for (int i = 2; i <= 40; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-2][0];
            dp[i][1] = dp[i-1][1] + dp[i-2][1];
        }
        
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(dp[n][0] + " " + dp[n][1]).append('\n');
        }
        
        System.out.print(sb);
    }
}