import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
   public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       
       int a = Integer.parseInt(st.nextToken());
       int b = Integer.parseInt(st.nextToken());
       int c = Integer.parseInt(st.nextToken());
       
       int count1 = 0;
       int count2 = 0;
       
       if (a == 1) count1++;
       else count2++;
       
       if (b == 1) count1++;
       else count2++;
       
       if (c == 1) count1++;
       else count2++;
       
       if (count1 > count2) System.out.println(1);
       else System.out.println(2);
   }
}