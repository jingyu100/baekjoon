import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
   public static void main(String[] args) throws IOException {
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int a = Integer.parseInt(br.readLine());
       int b = Integer.parseInt(br.readLine());
       
       int result = a * 10 + b;
       
       System.out.println(result);
   }
}