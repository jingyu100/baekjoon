import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int score = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        if (n == 0) {
            System.out.println(1);
            return;
        }

        int[] ranks = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            ranks[i] = Integer.parseInt(st.nextToken());
        }

        if (n == p && ranks[n - 1] >= score) {
            System.out.println(-1);
            return;
        }

        int rank = 1;
        for (int i = 0; i < n; i++) {
            if (ranks[i] > score) {
                rank++;
            } else {
                break;
            }
        }

        if(rank > p) System.out.println("-1");
        else System.out.println(rank);
    }
}