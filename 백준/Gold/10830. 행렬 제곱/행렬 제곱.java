import java.io.*;
import java.util.*;

public class Main {
    
    static int n, m = 1000;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        
        int[][] a = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(st.nextToken()) % m;
            }
        }
        
        int[][] r = p(a, b);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(r[i][j]).append(" ");
            }
            sb.append("\n");
        }
        
        System.out.print(sb);
    }
    
    static int[][] m(int[][] a, int[][] b) {
        int[][] c = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j] = (c[i][j] + (a[i][k] * b[k][j]) % m) % m;
                }
            }
        }
        
        return c;
    }
    
    static int[][] p(int[][] a, long b) {
        if (b == 0) {
            int[][] id = new int[n][n];
            for (int i = 0; i < n; i++) id[i][i] = 1;
            return id;
        }
        
        if (b == 1) return a;
        
        int[][] h = p(a, b / 2);
        int[][] r = m(h, h);
        
        if (b % 2 == 1) r = m(r, a);
        
        return r;
    }
}