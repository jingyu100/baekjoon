import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = 1;
        int cnt = 0;

        while (n > 0) {
            if (n < k) k = 1;
            n -= k;
            cnt++;
            k++;
        }
        System.out.println(cnt);
    }
}