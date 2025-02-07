import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] gandalf = {1, 2, 3, 3, 4, 10};
        int[] sauron = {1, 2, 2, 2, 3, 5, 10};

        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int gandalfSum = 0;
            int sauronSum = 0;
            for (int j = 0; j < 6; j++) {
                gandalfSum += Integer.parseInt(st.nextToken()) * gandalf[j];
            }
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 7; j++) {
                sauronSum += Integer.parseInt(st.nextToken()) * sauron[j];
            }
            sb.append("Battle ").append(i).append(": ");
            if (gandalfSum > sauronSum) sb.append("Good triumphs over Evil");
            else if (gandalfSum < sauronSum) sb.append("Evil eradicates all trace of Good");
            else sb.append("No victor on this battle field");
            sb.append('\n');
        }

        System.out.print(sb);
    }
}