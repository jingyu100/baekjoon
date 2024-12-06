import java.io.*;
import java.util.*;

public class Main {

    static int[][] wheel;
    static int[] rot;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        wheel = new int[4][8];

        for (int i = 0; i < 4; i++) {
            String s = br.readLine();
            for (int j = 0; j < 8; j++) {
                wheel[i][j] = s.charAt(j) - '0';
            }
        }

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken()) - 1;
            int dir = Integer.parseInt(st.nextToken());

            rot = new int[4];
            rot[num] = dir;
            check(num);
            turn();

        }

        int sum = 0;
        if (wheel[0][0] == 1) sum += 1;
        if (wheel[1][0] == 1) sum += 2;
        if (wheel[2][0] == 1) sum += 4;
        if (wheel[3][0] == 1) sum += 8;

        System.out.println(sum);
    }

    static void check(int num) {

        for (int i = num - 1; i >= 0; i--) {
            if (wheel[i][2] != wheel[i + 1][6]) {
                rot[i] = -rot[i + 1];
            } else {
                break;
            }
        }

        for (int i = num + 1; i < 4; i++) {
            if (wheel[i][6] != wheel[i - 1][2]) {
                rot[i] = -rot[i - 1];
            } else {
                break;
            }
        }
    }

    static void turn() {

        for (int i = 0; i < 4; i++) {
            if (rot[i] == 1) {
                int tmp = wheel[i][7];
                for (int j = 7; j > 0; j--) {
                    wheel[i][j] = wheel[i][j - 1];
                }
                wheel[i][0] = tmp;
            } else if (rot[i] == -1) {
                int tmp = wheel[i][0];
                for (int j = 0; j < 7; j++) {
                    wheel[i][j] = wheel[i][j + 1];
                }
                wheel[i][7] = tmp;
            }
        }
    }

}