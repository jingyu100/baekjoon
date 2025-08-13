import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] input = {a, b, c};
        Arrays.sort(input);

        if (!canFormTriangle(input)) {
            System.out.println(0);
            return;
        }

        boolean isRight = checkRightTriangle(input);
        boolean isEquilateral = checkRegularTriangle(input);

        if (isEquilateral && isRight) {
            System.out.println(2); 
        } else if (isRight) {
            System.out.println(1);
        } else if (isEquilateral) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }

    static boolean canFormTriangle(int[] input) {
        return input[0] + input[1] > input[2];
    }

    static boolean checkRightTriangle(int[] input) {
        return (input[0] * input[0]) + (input[1] * input[1]) == (input[2] * input[2]);
    }

    static boolean checkRegularTriangle(int[] input) {
        return input[0] == input[1] && input[1] == input[2];
    }
}