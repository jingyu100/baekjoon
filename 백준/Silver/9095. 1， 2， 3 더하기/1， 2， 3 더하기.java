import java.io.*;
import java.util.*;

class Main {

    static int[] chk;

    static int dp(int target) {
        chk = new int[target + 1];
        chk[0] = 1;
        for (int i = 1; i <= target; i++) {
            if (i >= 1) chk[i] += chk[i - 1];
            if (i >= 2) chk[i] += chk[i - 2];
            if (i >= 3) chk[i] += chk[i - 3];
        }
        return chk[target];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());
            bw.write(dp(target) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
