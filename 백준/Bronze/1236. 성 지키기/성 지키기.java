import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        int row = 0;
        int col = 0;

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            arr[i] = s.toCharArray();
        }

        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 'X') {
                    flag = false;
                    break;
                }
            }
            if (flag) row++;
        }

        for (int j = 0; j < m; j++) {
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                if (arr[i][j] == 'X') {
                    flag = false;
                    break;
                }
            }
            if (flag) col++;
        }

        System.out.println(Math.max(row, col));
    }
}