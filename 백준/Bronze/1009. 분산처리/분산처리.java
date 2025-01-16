import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int result = 1;
            a %= 10;

            for (int i = 0; i < b; i++) {
                result = (result * a) % 10;
            }

            if (result == 0) result = 10;

            sb.append(result).append('\n');
        }

        System.out.print(sb);
    }
}