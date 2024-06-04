import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum =0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sum += K;
        for (int i = 0; i < N; i++) {
            int in = sc.nextInt();
            int out = sc.nextInt();
            sum += in-out;
        }
        System.out.println("비와이");
    }
}