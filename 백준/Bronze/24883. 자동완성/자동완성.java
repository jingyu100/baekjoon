import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.nextLine().charAt(0);
        if(x == 'N' || x == 'n') {
            System.out.println("Naver D2");
        } else {
            System.out.println("Naver Whale");
        }
    }
}