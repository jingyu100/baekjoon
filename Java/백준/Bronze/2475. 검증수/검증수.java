import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int result = 0;
        int tmp;
        for (int i = 0; i < 5; i++) {
            tmp = scanner.nextInt();
            sum += tmp * tmp;
        }
        result = sum % 10;
        System.out.println(result);
    }
}
