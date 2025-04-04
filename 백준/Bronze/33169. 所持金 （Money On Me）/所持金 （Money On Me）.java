import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
   public static void main(String[] args) throws IOException {
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int a = Integer.parseInt(br.readLine());
       int b = Integer.parseInt(br.readLine());
       
       int total = a * 1000 + b * 10000;
       
       System.out.println(total);
   }
}