import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmp = 0, zero = 0, one = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            tmp = sc.nextInt();
            if (tmp == 1) one++;
            else zero++;
        }
        if(one > zero) System.out.println("Junhee is cute!");
        else System.out.println("Junhee is not cute!");
    }
}
