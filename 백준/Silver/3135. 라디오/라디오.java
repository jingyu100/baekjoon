import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int des = sc.nextInt();
        int cnt = sc.nextInt();
        int[] list = new int[cnt+1];
        int min = Math.abs(a-des);
        int count = 0;
        for (int i = 1; i <= cnt; i++) {
            list[i] = sc.nextInt();
            if(Math.abs(list[i]-des) < min) {
                min = Math.abs(list[i]-des);
                count++;
            }
        }
        if(count==0) {
            System.out.println(min);
        } else {
            System.out.println(min + 1);
        }
    }
}