import java.io.*;
import java.util.*;

class Main {

    public static int n;
    public static int m;
    public static int[][] box;
    public static int[] dx = {1, -1, 0, 0};
    public static int[] dy = {0, 0, 1, -1};
    public static Queue<tomato> queue = new LinkedList<tomato>();

    static class tomato {
        int x;
        int y;
        int day;

        public tomato(int _x, int _y, int _day) {
            this.x = _x;
            this.y = _y;
            this.day = _day;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        box = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                if (box[i][j] == 1) {
                    queue.offer(new tomato(i, j, 0));
                }

            }
        }
        bfs();
    }

    public static void bfs() {
        int day = 0;
        while (!queue.isEmpty()) {
            tomato t = queue.poll();
            day = t.day;
            for (int i = 0; i < 4; i++) {
                int nx = t.x + dx[i];
                int ny = t.y + dy[i];
                if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                    if (box[nx][ny] == 0) {
                        box[nx][ny] = 1;
                        queue.add(new tomato(nx, ny, day + 1));
                    }
                }
            }
        }
        if (checkTomato()) System.out.println(day);
        else System.out.println(-1);
    }

    static boolean checkTomato() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 0)
                    return false;
            }
        }
        return true;
    }

}