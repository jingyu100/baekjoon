import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            long x = sc.nextInt();
            long y = sc.nextInt();
            System.out.println(x+y);
        }
    }
}