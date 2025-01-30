import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double max = 0;
        double sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            double drink = Double.parseDouble(st.nextToken());
            max = Math.max(max, drink);
            sum += drink;
        }

        double result = max + (sum - max) / 2;

        if (result == (int) result) System.out.println((int) result);
        else System.out.println(result);
    }
}