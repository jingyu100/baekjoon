import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int h = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int ans = 0;
        if (h > 9) ans += (h - 9) * 60;
        if (m > 0) ans += m;

        System.out.println(ans);
    }
}