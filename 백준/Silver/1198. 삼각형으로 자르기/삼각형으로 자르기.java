import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] points = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }

        double max = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    double area = getArea(points[i], points[j], points[k]);
                    max = Math.max(max, area);
                }
            }
        }

        System.out.println(max);
    }

    static double getArea(int[] p1, int[] p2, int[] p3) {
        double area = Math.abs(
                (p1[0] * p2[1] + p2[0] * p3[1] + p3[0] * p1[1]) -
                        (p1[1] * p2[0] + p2[1] * p3[0] + p3[1] * p1[0])) / 2.0;
        return area;
    }
}