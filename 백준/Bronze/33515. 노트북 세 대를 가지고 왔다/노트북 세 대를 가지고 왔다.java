import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
   public static void main(String[] args) throws IOException {
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       
       int t1 = Integer.parseInt(st.nextToken());
       int t2 = Integer.parseInt(st.nextToken());
       
       int min = Math.min(t1, t2);
       
       System.out.println(min);
   }
}