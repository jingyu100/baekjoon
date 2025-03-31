import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String w1 = br.readLine();
        String w2 = br.readLine();

        int[] f1 = new int[26];
        int[] f2 = new int[26];

        for (char c : w1.toCharArray()) {
            f1[c - 'a']++;
        }
        for (char c : w2.toCharArray()) {
            f2[c - 'a']++;
        }
        
        int res = 0;
        for (int i = 0; i < 26; i++) {
            res += Math.abs(f1[i] - f2[i]);
        }
        
        System.out.println(res);
    }
}
