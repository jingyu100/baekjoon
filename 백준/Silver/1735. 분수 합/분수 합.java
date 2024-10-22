import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmp;
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = a2 * b2;
        int c1 = a1 * b2 + b1 * a2;
        int t = c1, b = c2;
        while (c2 != 0) {
            tmp = c1 % c2;
            c1 = c2;
            c2 = tmp;
        }
        if (t % c1 == 0 && b % c1 == 0)
            System.out.println(t / c1 + " " + b / c1);
        else System.out.println(t + " " + b);
    }
}
