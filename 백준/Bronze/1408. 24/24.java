import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int h1 = Integer.parseInt(st.nextToken());
        int m1 = Integer.parseInt(st.nextToken());
        int s1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), ":");
        int h2 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int s2 = Integer.parseInt(st.nextToken());

        int t1 = h1 * 3600 + m1 * 60 + s1;
        int t2 = h2 * 3600 + m2 * 60 + s2;

        int t = t2 - t1;
        if (t <= 0) t += 24 * 3600;

        int h = t / 3600;
        int m = (t % 3600) / 60;
        int s = t % 60;

        System.out.printf("%02d:%02d:%02d", h, m, s);
    }
}