import java.io.*;
import java.util.*;

public class Main {

    private static int[] seq;
    private static int n, m;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        seq = new int[m];
        dfs(1, 0);
        System.out.print(sb);
    }

    private static void dfs(int start, int depth) {
        if (depth == m) {
            for (int i = 0; i < seq.length; i++) {
                sb.append(seq[i]).append(' ');
            }
            sb.append("\n");
            return;
        }
        for (int i = start; i <= n; i++) {
            seq[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }
}
