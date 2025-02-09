import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] score = {6, 3, 2, 1, 2};

        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                sum += Integer.parseInt(st.nextToken()) * score[j];
            }
            sb.append(sum).append(" ");
        }
        System.out.println(sb);
    }
}