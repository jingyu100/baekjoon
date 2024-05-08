import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int sum = x+y;
            if (sum==0)
                break;
            System.out.println(sum);
        }
    }
}