import java.util.*;

public class Main {
    
    static int m, n, k;
    static int[][] arr;
    static boolean[][] chk;
    static int cnt;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        while(t-- > 0) {
            m = input.nextInt();
            n = input.nextInt();
            k = input.nextInt();
            
            arr = new int[m][n];
            chk = new boolean[m][n];
            cnt = 0;
            
            for(int i = 0; i < k; i++) {
                int x = input.nextInt();
                int y = input.nextInt();
                arr[x][y] = 1;
            }
            
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    if(arr[i][j] == 1 && !chk[i][j]) {
                        dfs(i, j);
                        cnt++;
                    }
                }
            }
            
            System.out.println(cnt);
        }
        
        input.close();
    }
    
    public static void dfs(int x, int y) {
        chk[x][y] = true;
        
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(nx >= 0 && nx < m && ny >= 0 && ny < n) {
                if(arr[nx][ny] == 1 && !chk[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}