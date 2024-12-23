import java.io.*;
import java.util.*;

public class Main {
    
    static final int INF = 987654321;
    static int n, m, x;
    static ArrayList<int[]>[] g;

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        
        g = new ArrayList[n + 1];
        
        for(int i = 1; i <= n; i++) {
            g[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int st1 = Integer.parseInt(st.nextToken());
            int ed = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            g[st1].add(new int[]{ed, t});
        }
        
        int max = 0;
        
        for(int i = 1; i <= n; i++) {
            if(i == x) continue;
            int to = dijk(i, x);
            int from = dijk(x, i);
            max = Math.max(max, to + from);
        }
        
        System.out.println(max);

    }
    
    static int dijk(int st, int ed) {

        int[] range = new int[n + 1];
        boolean[] chk = new boolean[n + 1];
        
        Arrays.fill(range, INF);
        range[st] = 0;
        
        for(int i = 0; i < n - 1; i++) {
            int min = INF;
            int now = -1;
            
            for(int j = 1; j <= n; j++) {
                if(!chk[j] && range[j] < min) {
                    min = range[j];
                    now = j;
                }
            }
            
            if(now == -1) break;
            chk[now] = true;
            
            for(int[] nxt : g[now]) {
                int nn = nxt[0];
                int nd = nxt[1];
                
                if(!chk[nn]) {
                    if(range[now] + nd < range[nn]) range[nn] = range[now] + nd;
                }
            }
        }
        
        return range[ed];
    }
}