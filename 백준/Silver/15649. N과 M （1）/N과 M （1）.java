import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static int[] list;
    public static boolean[] chk;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        list = new int[m];
        chk = new boolean[n];

        dfs(n, m, 0);

        System.out.println(sb);

    }

    public static void dfs(int n, int m, int dep) {
        if (dep == m) {
            for (int a : list) {
                sb.append(a).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!chk[i]) {
                chk[i] = true;
                list[dep] = i + 1;
                dfs(n, m, dep + 1);
                chk[i] = false;
            }
        }
    }

}