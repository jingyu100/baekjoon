import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            
            while (st.hasMoreTokens()) {
                sum += Integer.parseInt(st.nextToken());
            }
            
            System.out.println(sum);
        }
    }
}