import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    static int n, m;
    static int[][] map;
    static boolean[][] chk;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int year = 0;

        while (true) {
            int cnt = count();
            if (cnt >= 2) {
                System.out.println(year);
                break;
            }
            if (cnt == 0) {
                System.out.println(0);
                break;
            }
            melt();
            year++;
        }
    }

    static int count() {
        chk = new boolean[n][m];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] > 0 && !chk[i][j]) {
                    dfs(i, j);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    static void dfs(int x, int y) {
        chk[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                if (map[nx][ny] > 0 && !chk[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }

    static void melt() {
        int[][] tmp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tmp[i][j] = map[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] > 0) {
                    int ocean = 0;
                    for (int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                            if (map[nx][ny] == 0) {
                                ocean++;
                            }
                        }
                    }
                    tmp[i][j] = Math.max(0, map[i][j] - ocean);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = tmp[i][j];
            }
        }
    }
}