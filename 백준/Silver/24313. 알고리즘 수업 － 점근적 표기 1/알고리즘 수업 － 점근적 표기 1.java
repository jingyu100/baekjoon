import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        if (a < 0) {
            if ((double) b / (c - a) <= d) System.out.println("1");
            else System.out.println("0");
        }
        if (a == 0) {
            if ((double) b / c <= d) System.out.println("1");
            else System.out.println("0");
        }
        if (a > 0) {
            if (a <= c && (double) b / (c - a) <= d) System.out.println("1");
            else System.out.println("0");
        }
    }
}