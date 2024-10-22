import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static boolean[] sieve(int max) {
        boolean[] isPrime = new boolean[max + 1];
        for (int i = 2; i <= max; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt;
        for (int i = 0; i < n; i++) {
            cnt = 0;
            int input = sc.nextInt();
            boolean[] checkList = sieve(input);
            for (int j = 1; j <= input / 2; j++) {
                if (checkList[j] && checkList[input - j]) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
