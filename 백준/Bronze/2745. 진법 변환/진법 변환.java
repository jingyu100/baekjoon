import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String str = input[0];
        int n = Integer.parseInt(input[1]);
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(str.length() - i - 1) - 55;
            if (num < 10) {
                num += 7;
            }
            ans += num * Math.pow(n, i);
        }
        System.out.println(ans);
    }
}