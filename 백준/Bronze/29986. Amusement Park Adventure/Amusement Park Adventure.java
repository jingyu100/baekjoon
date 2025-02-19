import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int cnt = 0;
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int min = Integer.parseInt(st.nextToken());
            if (h >= min) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}