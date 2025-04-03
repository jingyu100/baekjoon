import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
   public static void main(String[] args) throws IOException {
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       
       int n = Integer.parseInt(st.nextToken());
       int m = Integer.parseInt(st.nextToken());
       int k = Integer.parseInt(st.nextToken());
       
       int fO = m;      
       int fX = n - m;  
       int bO = k;        
       int bX = n - k;  
       
       int ansO = Math.min(fO, bO);
       int ansX = Math.min(fX, bX);
       int ans = ansO + ansX;
       
       System.out.println(ans);
   }
}