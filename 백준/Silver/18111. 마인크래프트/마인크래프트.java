import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] land = new int[n][m];
        int min = 256;
        int max = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                land[i][j] = Integer.parseInt(st.nextToken());
                min = Math.min(min, land[i][j]);
                max = Math.max(max, land[i][j]);
            }
        }

        int time = Integer.MAX_VALUE;
        int height = 0;

        for (int h = min; h <= max; h++) {
            int inventory = b;
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (land[i][j] > h) {
                        cnt += (land[i][j] - h) * 2;
                        inventory += (land[i][j] - h);
                    } else if (land[i][j] < h) {
                        cnt += (h - land[i][j]);
                        inventory -= (h - land[i][j]);
                    }
                }
            }

            if (inventory >= 0) {
                if (cnt <= time) {
                    time = cnt;
                    height = h;
                }
            }
        }

        System.out.println(time + " " + height);
    }
}