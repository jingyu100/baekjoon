import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s = Long.parseLong(br.readLine());
        int n = 1;
        long sum = 0;
        
        while (sum + n <= s) {
            sum += n;
            n++;
        }
        
        System.out.println(n - 1);
    }
}