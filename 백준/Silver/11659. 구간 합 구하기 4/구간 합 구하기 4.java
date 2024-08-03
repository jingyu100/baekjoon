import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] list = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            list[i] = list[i - 1] + sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(list[b] - list[a - 1]);
        }
    }
}