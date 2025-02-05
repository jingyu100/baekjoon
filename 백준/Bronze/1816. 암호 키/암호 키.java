import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            long num = Long.parseLong(br.readLine());
            boolean chk = true;
            for (int i = 2; i <= 1000000; i++) {
                if (num % i == 0) {
                    chk = false;
                    break;
                }
            }

            sb.append(chk ? "YES" : "NO").append('\n');
        }
        System.out.print(sb);
    }
}