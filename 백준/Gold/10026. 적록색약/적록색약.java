import java.util.Scanner;

public class Main {
    
    static int n;
    static char[][] list;
    static boolean[][] chk;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        list = new char[n][n];
        chk = new boolean[n][n];
        
        for(int i = 0; i < n; i++) {
            String line = sc.next();
            for(int j = 0; j < n; j++) {
                list[i][j] = line.charAt(j);
            }
        }
        
        int ans1 = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(!chk[i][j]) {
                    dfs(i, j);
                    ans1++;
                }
            }
        }
        
        chk = new boolean[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(list[i][j] == 'G') {
                    list[i][j] = 'R';
                }
            }
        }
        
        int ans2 = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(!chk[i][j]) {
                    dfs(i, j);
                    ans2++;
                }
            }
        }
        
        System.out.println(ans1 + " " + ans2);
    }
    
    static void dfs(int x, int y) {
        
        chk[x][y] = true;
        char color = list[x][y];
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
                if(!chk[nx][ny] && list[nx][ny] == color) {
                    dfs(nx, ny);
                }
            }
        }
    }
}