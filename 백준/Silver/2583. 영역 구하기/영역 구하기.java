import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
   
  static int m, n, k;
  static int[][] map;
  static int cnt;
  static int[] dx = {-1, 1, 0, 0};
  static int[] dy = {0, 0, -1, 1};
  
  public static void main(String[] args) throws IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      m = Integer.parseInt(st.nextToken());
      n = Integer.parseInt(st.nextToken());
      k = Integer.parseInt(st.nextToken());
      
      map = new int[m][n];
      
      for (int i = 0; i < k; i++) {
          st = new StringTokenizer(br.readLine());
          int x1 = Integer.parseInt(st.nextToken());
          int y1 = Integer.parseInt(st.nextToken());
          int x2 = Integer.parseInt(st.nextToken());
          int y2 = Integer.parseInt(st.nextToken());
          for(int y = y1; y < y2; y++) {
              for(int x = x1; x < x2; x++) {
                  map[y][x] = 1;
              }
          }
      }
      
      ArrayList<Integer> ans = new ArrayList<>();
      
      for (int i = 0; i < m; i++) {
          for (int j = 0; j < n; j++) {
              if (map[i][j] == 0) {
                  cnt = 0;
                  dfs(i, j);
                  ans.add(cnt);
              }
          }
      }
      Collections.sort(ans);
      System.out.println(ans.size());
      for(int area : ans) {
          System.out.print(area + " ");
      }
  }
  
  static void dfs (int x, int y) {
      map[x][y] = 1;
      cnt++;
      for (int i = 0; i < 4; i++) {
          int nx = x + dx[i];
          int ny = y + dy[i];
          
          if (nx >= 0 && nx < m && ny >= 0 && ny < n && map[nx][ny] == 0) dfs(nx, ny);
      }
  }
}