import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (true) {
            n = sc.nextInt();
            if (n == -1)
                break;
            int sum = 1;
            String result = n + " = 1";
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum += i;
                    result += " + " + i;
                }
            }
            if (sum == n) {
                System.out.println(result);
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }   
}