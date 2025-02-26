import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
   public static void main(String[] args) throws IOException {
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int l = Integer.parseInt(br.readLine());
       String str = br.readLine();
       
       long r = 1;
       long m = 1234567891;
       long hash = 0;
       
       for (int i = 0; i < l; i++) {
           long val = str.charAt(i) - 'a' + 1;  
           hash = (hash + val * r) % m;
           r = (r * 31) % m;  
       }
       System.out.println(hash);
   }
}