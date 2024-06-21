import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int length = word.length();
        for (int i = 0; i < length; i++) {
            if(i==0) {
                System.out.print(word.charAt(i));
            } else if(i%10==0) {
                System.out.println();
                System.out.print(word.charAt(i));
            } else {
                System.out.print(word.charAt(i));
            }
        }
    }
}