import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] list = new int[n];
        for(int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        
        int[] dp = new int[n];
        for(int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                if(list[i] > list[j]) {
                    if(dp[i] < dp[j] + 1) dp[i] = dp[j] + 1;
                }
            }
        }
        
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if(ans < dp[i]) ans = dp[i];
        }
        
        System.out.println(ans);
    }
}