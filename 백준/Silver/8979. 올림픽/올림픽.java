import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][4];
        int g = 0, s = 0, b = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
            arr[i][3] = Integer.parseInt(st.nextToken());
            if (arr[i][0] == k) {
                g = arr[i][1];
                s = arr[i][2];
                b = arr[i][3];
            }
        }

        int rank = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i][1] > g) rank++;
            else if (arr[i][1] == g) {
                if (arr[i][2] > s) rank++;
                else if (arr[i][2] == s) {
                    if (arr[i][3] > b) rank++;
                }
            }
        }
        System.out.println(rank);
    }
}