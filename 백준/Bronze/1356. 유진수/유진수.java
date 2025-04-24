import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        
        boolean ans = false;
        
        for (int i = 1; i < n.length(); i++) {
            String left = n.substring(0, i);
            String right = n.substring(i);
            long leftProduct = 1;
            long rightProduct = 1;
            for (int j = 0; j < left.length(); j++) {
                leftProduct *= (left.charAt(j) - '0');
            }
            for (int j = 0; j < right.length(); j++) {
                rightProduct *= (right.charAt(j) - '0');
            }
            if (leftProduct == rightProduct) {
                ans = true;
                break;
            }
        }
        System.out.println(ans ? "YES" : "NO");
    }
}