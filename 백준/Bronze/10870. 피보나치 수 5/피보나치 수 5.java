import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }

    static int fibo(int a) {
        if (a == 0) return 0;
        if (a == 1) return 1;
        return fibo(a - 1) + fibo(a - 2);
    }
}