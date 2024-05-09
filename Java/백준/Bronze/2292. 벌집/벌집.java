import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int count = 1;
        int range = 2;
        if (target == 1) {
            System.out.print(1);
        }
        else {
            while (range <= target) {
                range = range + (6 * count);
                count++;
            }
            System.out.print(count);
        }
    }
}