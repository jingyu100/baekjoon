import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int point = 2;
        for (int i = 1; i <= n; i++) {
            point = (point - 1) + point;
        }
        System.out.println(point * point);
    }
}