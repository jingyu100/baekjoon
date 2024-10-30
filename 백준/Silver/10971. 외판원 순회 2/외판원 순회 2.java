import java.util.Scanner;

public class Main {
    static int[][] map = new int[11][11];
    static boolean[] chk = new boolean[11];
    static int n, min = Integer.MAX_VALUE;

    public static void func(int x, int d, int sum) {
        if (min <= sum) return; 
        if (d == n - 1) {
            if (map[x][1] > 0 && min > sum + map[x][1]) {
                min = sum + map[x][1];
            }
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!chk[i] && map[x][i] > 0) {
                chk[i] = true;
                func(i, d + 1, sum + map[x][i]);
                chk[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        chk[1] = true;
        func(1, 0, 0); 
        System.out.println(min);
        sc.close();
    }
}
