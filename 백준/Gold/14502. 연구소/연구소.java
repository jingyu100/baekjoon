import java.util.*;

public class Main {
    static int n, m;
    static int[][] map;
    static int[][] tmp; 
    static int ans = 0; 

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        map = new int[n][m];
        tmp = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        build(0); 
        System.out.println(ans);
    }

    static void build(int cnt) {
        
        if (cnt == 3) { 
            spread();
            ans = Math.max(ans, calc()); 
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) { 
                    map[i][j] = 1; 
                    build(cnt + 1); 
                    map[i][j] = 0; 
                }
            }
        }
    }

    static void spread() {
        
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tmp[i][j] = map[i][j]; 
                if (tmp[i][j] == 2) { 
                    q.add(new int[]{i, j});
                }
            }
        }

        while (!q.isEmpty()) {
            
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m && tmp[nx][ny] == 0) {
                    tmp[nx][ny] = 2; 
                    q.add(new int[]{nx, ny});
                }
            }
        }
    }

    static int calc() {
        
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (tmp[i][j] == 0) cnt++;
            }
        }
        return cnt;
    }
}
