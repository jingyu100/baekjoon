import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        int len = arr[0].length();

        for (int k = 1; k <= len; k++) {
            HashSet<String> set = new HashSet<>();
            boolean chk = false;

            for (int i = 0; i < n; i++) {
                String sub = arr[i].substring(len - k);
                if (!set.add(sub)) {
                    chk = true;
                    break;
                }
            }

            if (!chk) {
                System.out.println(k);
                break;
            }
        }
    }
}