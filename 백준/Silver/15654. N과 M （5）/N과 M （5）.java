import java.io.*;
import java.util.*;

class Main {

    private static int[] number;
    private static int[] seq;
    private static boolean[] visited;
    private static int n, m;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        number = new int[n];
        seq = new int[m];
        visited = new boolean[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(number);
        dfs(0);
        System.out.print(sb);
    }

    static void dfs(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(seq[i]).append(' ');
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                seq[depth] = number[i];
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}
