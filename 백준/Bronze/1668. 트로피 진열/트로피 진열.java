import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        
        for(int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        
        int l = 1, r = 1;
        int m = h[0];
        
        for(int i = 1; i < n; i++) {
            if(h[i] > m) {
                l++;
                m = h[i];
            }
        }
        
        m = h[n-1];
        for(int i = n-2; i >= 0; i--) {
            if(h[i] > m) {
                r++;
                m = h[i];
            }
        }
        
        System.out.println(l);
        System.out.println(r);
    }
}