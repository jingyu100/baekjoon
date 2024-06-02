import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            int sec = sc.nextInt();
            sum += sec;
        }
        System.out.println(sum/60);
        System.out.println(sum%60);
    }
}