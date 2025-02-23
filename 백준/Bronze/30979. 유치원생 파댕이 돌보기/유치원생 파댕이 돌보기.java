import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        String[] arr = br.readLine().split(" ");
        
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(arr[i]);
        }

        if (sum >= t) System.out.println("Padaeng_i Happy");
        else System.out.println("Padaeng_i Cry");
    }
}