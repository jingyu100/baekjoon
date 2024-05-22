import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
        int num,sum;
        for(int i = 0; i < N; i++) {
            num = i;
            sum = 0;
            while (true) {
                sum += num % 10;
                num /= 10;
                if(num == 0) {
                    break;
                }
            }
            if(sum + i == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}