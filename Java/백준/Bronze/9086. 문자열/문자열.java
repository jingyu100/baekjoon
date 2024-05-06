import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            String word = sc.next();
            System.out.print(word.charAt(0));
            System.out.println(word.charAt(word.length()-1));
        }
    }
}