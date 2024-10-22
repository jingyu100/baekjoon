import java.util.Scanner;

public class Main {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        int betweenValue = input[1] - input[0];
        for (int i = 1; i < n - 1; i++) {
            betweenValue = gcd(betweenValue, input[i + 1] - input[i]);
        }
        for (int i = 0; i < n - 1; i++) {
            cnt += (input[i + 1] - input[i]) / betweenValue - 1;
        }
        System.out.println(cnt);
    }
}
