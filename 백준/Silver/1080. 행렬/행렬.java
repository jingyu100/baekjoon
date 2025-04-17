import java.util.Scanner;

public class Main {
    
    static int n, m;
    static int[][] a, b;
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        
        a = new int[n][m];
        b = new int[n][m];
        
        for(int i = 0; i < n; i++) {
            String line = sc.next();
            for(int j = 0; j < m; j++) {
                a[i][j] = line.charAt(j) - '0';
            }
        }
        
        for(int i = 0; i < n; i++) {
            String line = sc.next();
            for(int j = 0; j < m; j++) {
                b[i][j] = line.charAt(j) - '0';
            }
        }
        
        if(n < 3 || m < 3) {
            boolean same = true;
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    if(a[i][j] != b[i][j]) {
                        same = false;
                        break;
                    }
                }
                if(!same) break;
            }
            if(same) System.out.println(0);
            else System.out.println(-1); 
            return;
        }
        
        int count = 0;
        
        for(int i = 0; i <= n - 3; i++) {
            for(int j = 0; j <= m - 3; j++) {
                if(a[i][j] != b[i][j]) {
                    flip(i, j);
                    count++;
                }
            }
        }
        
        boolean possible = true;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(a[i][j] != b[i][j]) {
                    possible = false;
                    break;
                }
            }
            if(!possible) break;
        }
        if(possible) System.out.println(count);
        else System.out.println(-1);
    }
    
    public static void flip(int x, int y) {
        for(int i = x; i < x + 3; i++) {
            for(int j = y; j < y + 3; j++) {
                a[i][j] = 1 - a[i][j]; 
            }
        }
    }
}