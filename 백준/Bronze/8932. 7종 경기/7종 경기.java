import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        double[] a = {9.23076, 1.84523, 56.0211, 4.99087, 0.188807, 15.9803, 0.11193};
        double[] b = {26.7, 75, 1.5, 42.5, 210, 3.8, 254};
        double[] c = {1.835, 1.348, 1.05, 1.81, 1.41, 1.04, 1.88};
        boolean[] isTrack = {true, false, false, true, false, false, true};
        
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int totalScore = 0;
            for (int j = 0; j < 7; j++) {
                double p = Double.parseDouble(st.nextToken());
                if (isTrack[j]) totalScore += (int) Math.floor(a[j] * Math.pow(b[j] - p, c[j]));
                else totalScore += (int) Math.floor(a[j] * Math.pow(p - b[j], c[j]));
            }
            System.out.println(totalScore);
        }
    }
}