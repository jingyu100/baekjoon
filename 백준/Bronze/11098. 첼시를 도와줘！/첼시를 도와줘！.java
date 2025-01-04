import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());  
        
        StringBuilder sb = new StringBuilder();
        
        while (n-- > 0) {
            int p = Integer.parseInt(br.readLine());  
            
            int maxPrice = 0;
            String bestPlayer = "";
            
            for (int i = 0; i < p; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int price = Integer.parseInt(st.nextToken());
                String name = st.nextToken();
                
                if (price > maxPrice) {
                    maxPrice = price;
                    bestPlayer = name;
                }
            }
            
            sb.append(bestPlayer).append('\n');
        }
        
        System.out.print(sb);
    }
}