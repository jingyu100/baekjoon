import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int min = 100;
        boolean odd = false;
        
        for (int i = 0; i < 7; i++) {
            int n = sc.nextInt();
            if (n % 2 == 1) {
                sum += n;
                if (n < min) min = n;
                odd = true;
            }
        }
        if (odd) {
            System.out.println(sum);
            System.out.println(min);
        } else System.out.println(-1);
    }
}