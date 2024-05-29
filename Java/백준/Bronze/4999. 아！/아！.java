import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my = sc.nextLine();
        String doc = sc.nextLine();
        if(my.length() >= doc.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}