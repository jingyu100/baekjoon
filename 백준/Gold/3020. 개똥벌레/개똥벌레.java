import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        
        int[] bot = new int[h + 1];
        int[] top = new int[h + 1];
        
        for (int i = 0; i < n/2; i++) {
            int bh = Integer.parseInt(br.readLine());
            int th = Integer.parseInt(br.readLine());
            
            bot[bh]++;
            top[th]++;
        }
        
        int[] sumb = new int[h + 1];
        int[] sumt = new int[h + 1];
        
        for (int i = h - 1; i > 0; i--) {
            sumb[i] = sumb[i + 1] + bot[i];
        }
        
        for (int i = h - 1; i > 0; i--) {
            sumt[i] = sumt[i + 1] + top[i];
        }
        
        int min = n;
        int cnt = 0;
        
        for (int i = 1; i <= h; i++) {
            int obs = sumb[i] + sumt[h - i + 1];
            
            if (obs < min) {
                min = obs;
                cnt = 1;
            }
            else if (obs == min) cnt++;
        }
        
        System.out.println(min + " " + cnt);
    }
}