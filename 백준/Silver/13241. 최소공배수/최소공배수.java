import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tmp;
        long a1 = sc.nextLong();
        long a2 = sc.nextLong();
        long t = a1, b = a2;
        while (a2 != 0) {
            tmp = a1 % a2;
            a1 = a2;
            a2 = tmp;
        }
        System.out.println(t * b / a1);
    }
}
