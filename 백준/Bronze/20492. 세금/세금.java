import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print((int)(n*0.78)+" ");
        System.out.print((int)(n-n*0.20*0.22));
    }
}