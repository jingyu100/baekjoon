import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        for (int i = cnt; i > 0; i--) {
            for (int j = 0; j < cnt; j++) {
                if(i>j) {
                    System.out.print("*");
                } 
            }
            System.out.println("");
        }
    }
}