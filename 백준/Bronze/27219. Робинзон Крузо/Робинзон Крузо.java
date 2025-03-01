import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
   public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int n = Integer.parseInt(br.readLine());
       
       StringBuilder sb = new StringBuilder();
       
       for (int i = 0; i < n / 5; i++) {
           sb.append("V");
       }
       
       for (int i = 0; i < n % 5; i++) {
           sb.append("I");
       }
       System.out.println(sb);
   }
}