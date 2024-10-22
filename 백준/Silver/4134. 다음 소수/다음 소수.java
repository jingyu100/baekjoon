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
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            long input = sc.nextLong();
            while (!isPrime(input)) {
                input++;
            }
            System.out.println(input);
        }
    }
}
