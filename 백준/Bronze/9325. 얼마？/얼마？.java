import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int s = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int totalPrice = s;
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int q = Integer.parseInt(st.nextToken());
                int p = Integer.parseInt(st.nextToken());
                totalPrice += q * p;
            }
            System.out.println(totalPrice);
        }
    }
}