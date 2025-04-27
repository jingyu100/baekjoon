import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int minPackage = Integer.MAX_VALUE;
        int minSingle = Integer.MAX_VALUE;
        
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int packagePrice = Integer.parseInt(st.nextToken());
            int singlePrice = Integer.parseInt(st.nextToken());
            
            minPackage = Math.min(minPackage, packagePrice);
            minSingle = Math.min(minSingle, singlePrice);
        }
        
        int allSingle = n * minSingle;
        
        int packageCount = (n + 5) / 6; 
        int allPackage = packageCount * minPackage;
        int mixPrice = (n / 6) * minPackage + (n % 6) * minSingle;
        int result = Math.min(allSingle, Math.min(allPackage, mixPrice));
        System.out.println(result);
    }
}