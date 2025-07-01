import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            if (x != i) c++;
        }
        
        System.out.println(c);
    }
}