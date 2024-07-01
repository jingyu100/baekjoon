import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        while(true) {
            if (N % 5 == 0) {
                N -= 5;
                cnt++;
            } else {
                N -= 3;
                cnt++;
            }
            if(N==0) {
                System.out.println(cnt);
                break;
            } 
            if(N > 0 && N < 3) {
                System.out.println("-1");
                break;
            }
        }
    }
}