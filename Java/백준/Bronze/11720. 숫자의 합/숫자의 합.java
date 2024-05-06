import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int sum = 0;
        String num=sc.next();
        for (int i = 0; i < count; i++) {
                int x = num.charAt(i)-48;
                sum+=x;
            }
        System.out.println(sum);
    }
}