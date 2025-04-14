import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        int cnt = 0;
        int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                cnt++;
            } else {
                cnt--;
                if (s.charAt(i-1) == '(') result += cnt;
                else result++;
            }
        }
        System.out.println(result);
    }
}