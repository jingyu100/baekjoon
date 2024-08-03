import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        boolean[] prime = new boolean[10001];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i < 10001; i++) {
            if (prime[i]) {
                for (int j = i * i; j < 10001; j += i) {
                    prime[j] = false;
                }
            }
        }
        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());
            int tmp = num / 2;
            for (int j = tmp; j >= 2; j--) {
                if (prime[j] && prime[num - j]) {
                    System.out.println(j + " " + (num - j));
                    break;
                }
            }
        }
    }
}
