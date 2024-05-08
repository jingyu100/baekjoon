import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()==true) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x+y);
        }
    }
}