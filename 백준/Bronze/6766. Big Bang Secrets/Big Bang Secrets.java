import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int shift = Integer.parseInt(st.nextToken());
        String input = br.readLine();
        int len = input.length();

        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        for (int i = 0; i < len; i++) {
            char cur = input.charAt(i);
            int total = (3 * (i + 1) + shift) % 26;
            int pos = cur - 'A';
            pos = (pos - total + 26) % 26;
            sb.append(alphabet[pos]);
        }
        System.out.println(sb);
    }
}