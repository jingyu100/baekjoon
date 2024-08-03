import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] cnt = new int[10001];
        int n = Integer.parseInt(br.readLine());;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            cnt[number]++;
        }
        for (int i = 0; i < cnt.length; i++) {
            for (int j = 0; j < cnt[i]; j++) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}