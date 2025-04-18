import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int s = sc.nextInt(); 
        int t = sc.nextInt(); 
        int d = sc.nextInt();
        
        double time = (double)d / (2 * s); 
        double distance = time * t; 
        
        System.out.println((int)distance);
    }
}