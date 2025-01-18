import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int[] cnt = new int[10];

        for (int i = 0; i < n.length(); i++) {
            int num = n.charAt(i) - '0';
            if (num == 9) num = 6;
            cnt[num]++;
        }

        cnt[6] = (cnt[6] + 1) / 2;

        int max = 0;
        for (int i = 0; i < 10; i++) {
            max = Math.max(max, cnt[i]);
        }

        System.out.println(max);
    }
}