import java.util.Scanner;

public class Main {
    
    static int n, m;
    static int[][] list;
    static boolean[][] chk;
    static int dx[] = {1,-1,0,0}, dy[] = {0,0,1,-1};
    static int cnt;
    static int[][] melt;
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        list = new int[n][m];
        
        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++)
                list[i][j] = sc.nextInt();
                
        int time = 0;
        int last = 0;
        
        while(true) {
            cnt = 0;
            for(int i=0; i<n; i++)
                for(int j=0; j<m; j++)
                    if(list[i][j]==1)
                        cnt++;
            
            if(cnt==0) break;
            last = cnt;
            
            chk = new boolean[n][m];
            melt = new int[n][m];
            dfs(0,0);
            
            for(int i=0; i<n; i++)
                for(int j=0; j<m; j++)
                    if(melt[i][j]==1)
                        list[i][j] = 0;
                        
            time++;
        }
        
        System.out.println(time);
        System.out.println(last);
    }
    
    static void dfs(int x, int y) {
        chk[x][y] = true;
        
        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx<0 || ny<0 || nx>=n || ny>=m) continue;
            if(chk[nx][ny]) continue;
            
            if(list[nx][ny]==0) dfs(nx,ny);
            else
                melt[nx][ny] = 1;
        }
    }
}