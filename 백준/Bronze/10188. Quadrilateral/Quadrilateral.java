import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int w = sc.nextInt();
            for (int j = 0; j < w; j++) {
                for (int k = 0; k < l; k++) {
                    System.out.print("X");
                }
                System.out.println();
            }
            if (i < n - 1) System.out.println();
        }
    }
}