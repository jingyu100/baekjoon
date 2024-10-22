import java.util.Scanner;

public class Main {

    static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        } else {
            for (long i = 2; i * i <= n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int cnt = 0;
            int input = sc.nextInt();
            if (input == 0) break;
            for (int i = input + 1; i <= 2 * input; i++) {
                if (isPrime(i)) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
