import java.util.*;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int cnt = 0;
            
            for (int j = n; j <= m; j++) {
                String num = String.valueOf(j);
                for (int k = 0; k < num.length(); k++) {
                    if (num.charAt(k) == '0') cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}