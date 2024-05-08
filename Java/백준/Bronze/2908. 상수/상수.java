import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int h = x/100;
        int m = x%100/10;
        int s = x%10;
        int h1 = y/100;
        int m1 = y%100/10;
        int s1 = y%10;
        int sum1 = s*100 + m*10 + h;
        int sum2 = s1*100 + m1*10 + h1;
        if(sum1>sum2) {
            System.out.println(sum1);
        }
        else System.out.println(sum2);
    }
}