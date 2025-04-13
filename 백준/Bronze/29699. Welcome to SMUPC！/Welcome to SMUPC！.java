import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        String label = "WelcomeToSMUPC";
        int len = label.length();
        
        int idx = (int)((n - 1) % len);
        
        System.out.println(label.charAt(idx));
    }
}