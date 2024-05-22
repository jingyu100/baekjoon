import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int sum=0,tmp=0;
        int list[] = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    sum  = list[i] + list[j] + list[k];
                    if (sum > tmp && M >= sum) {
                        tmp = sum;
                    }
                }
            }
        }
        System.out.println(tmp);
    }
}